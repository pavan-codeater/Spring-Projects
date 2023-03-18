package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class AfterFinallyDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO theAccountDAO=context.getBean("accountDAO",AccountDAO.class);
		
		
	
		
		try {
		boolean trip=false;
		List<Account> accounts=theAccountDAO.findAccounts(false);
		}
		catch(Exception e) {
			System.out.print("Main Program...Caught Exception");
		}

	}

}
