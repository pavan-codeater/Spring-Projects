package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateCourseAndStudentsDemo {

	public static void main(String[] args) {
		
		
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).addAnnotatedClass(Review.class).addAnnotatedClass(Student.class).buildSessionFactory();
		
		
		Session session=factory.getCurrentSession();
		
		try {
				   
		   
			
			
			
			session.beginTransaction();
			
			Course c2=new Course("Pacman");
			
			
			Student s1=new Student("madhu","k","pav@gmail.com");
			Student s2=new Student("john","k","kish@amid.com.com");
			
			c2.addStudent(s1);
			c2.addStudent(s2);
			session.save(c2);

			session.save(s1);
			session.save(s2);
			
		
			
		
			
			session.save(s1);
			session.save(s2); 
			
			
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
