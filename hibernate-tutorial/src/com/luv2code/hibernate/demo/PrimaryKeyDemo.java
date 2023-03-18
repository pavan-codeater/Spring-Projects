package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {
	
	
	public static void main(String[] args) {
		
		
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		
		
		Session session=factory.getCurrentSession();
		
		try {
			
			Student tempStudent1=new Student("Pavan","L S","pavanls@outlook.com");
			Student tempStudent2=new Student("rahul","L S","rahul@outlook.com");
			Student tempStudent3=new Student("vasu","L S","vasu@outlook.com");
			
			
			session.beginTransaction();
			
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			
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
