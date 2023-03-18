package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateCoursesDemo {

	public static void main(String[] args) {
		
		
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();
		
		
		Session session=factory.getCurrentSession();
		
		try {
				   
		   
			session.beginTransaction();
			

			   int id=1;
			   
			   Instructor temp=session.get(Instructor.class,id);
			   
			   Course tempCourse1=new Course("Backend Development");
			   Course tempCourse2=new Course("java Development");
				
			   temp.add(tempCourse1);
			   temp.add(tempCourse2);
			   
			   session.save(tempCourse1);
			   session.save(tempCourse2);
		
			session.getTransaction().commit();
			
			
			System.out.println("Done Session");
			
			
		}
		catch(Exception e) {
			System.out.println("The exception is" +e);
		}
		
		finally {
			session.close();
			factory.close();
		}
		
		
		

	}

}
