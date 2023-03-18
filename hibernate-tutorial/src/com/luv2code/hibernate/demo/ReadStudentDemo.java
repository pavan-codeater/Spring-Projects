package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		
		
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		
		
		Session session=factory.getCurrentSession();
		
		try {
			
			Student tempStudent=new Student("Rosy","L S","Rosyls@outlook.com");
			
			
			session.beginTransaction();
			
			session.save(tempStudent);
			
			session.getTransaction().commit();
			

			 session=factory.getCurrentSession();
			 session.beginTransaction();
			 
			
			
			Student theStudent=session.get(Student.class,tempStudent.getId());
			session.getTransaction().commit();
			
			System.out.println("Read operation is Success "+theStudent);
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
