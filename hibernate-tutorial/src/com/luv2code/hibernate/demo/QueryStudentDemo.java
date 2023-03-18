package com.luv2code.hibernate.demo;


import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;



public class QueryStudentDemo {

	public static void main(String[] args) {
		
		
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		
		
		Session session=factory.getCurrentSession();
		
		try {
			
			//Student tempStudent=new Student("Pavan","L S","pavanls@outlook.com");
			
			
			session.beginTransaction();
			
			List<Student>theStudents=session.createQuery("from Student "+"where firstName LIKE '%Ros%'").getResultList();
			
			for(Student s:theStudents) {
				System.out.println(s);
			}
			
			
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
