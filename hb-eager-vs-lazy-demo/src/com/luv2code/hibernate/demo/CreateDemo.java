package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateDemo {

	public static void main(String[] args) {
		
		
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		
		
		Session session=factory.getCurrentSession();
		
		try {
			
		  Instructor tempInstructor=new Instructor("Kareena","mary","tom@gmail.com");
		  
		  InstructorDetail tempInstructionDetail=new InstructorDetail("tomyoutube","Teaching Coding easy");
		  
		  tempInstructor.setInstructorDetail(tempInstructionDetail);
		  
			
			
			session.beginTransaction();
			
			
			session.save(tempInstructor);
		
			session.getTransaction().commit();
			
			
			System.out.println("Done Session");
			
			
		}
		catch(Exception e) {
			System.out.println("The exception is" +e);
		}
		
		finally {
			factory.close();
		}
		
		
		

	}

}
