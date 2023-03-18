package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class DeleteInstructorDetailRemove {

	public static void main(String[] args) {
		
		
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		
		
		Session session=factory.getCurrentSession();
		
		try {
		
			int theId=3;
			
			session.beginTransaction();
			
InstructorDetail temp=session.get(InstructorDetail.class,theId);
			

System.out.println(temp.getHobby());
			
			temp.getInstructor().setInstructorDetail(null); 

             session.delete(temp);
			System.out.println(temp.getInstructor());
			
		
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
