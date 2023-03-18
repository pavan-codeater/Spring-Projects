package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaDemoApp {

	public static void main(String []args) {
	
	AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(SportConfig.class);
	
	Coach theCoach=context.getBean("swimCoach",Coach.class);
	
	
	System.out.println(theCoach.getDailyWorkout());
//	
	System.out.println(theCoach.getFortune());
	
	
	}
	
}
