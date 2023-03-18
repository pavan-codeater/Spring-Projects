package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;
import com.luv2code.hibernate.demo.entity.Student;

public class GetCourseAndReviewsDemo {

	public static void main(String[] args) {
		
		
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).addAnnotatedClass(Review.class).buildSessionFactory();
		
		
		Session session=factory.getCurrentSession();
		
		try {
				   
		   
			session.beginTransaction();
					
			Course temp=session.get(Course.class,10);
			
			
			System.out.println(temp);
			
			
			session.delete(temp);
			;
			
			
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
