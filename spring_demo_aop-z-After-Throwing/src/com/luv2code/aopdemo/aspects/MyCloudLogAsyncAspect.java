package com.luv2code.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(5)
public class MyCloudLogAsyncAspect {

	

	@Before("com.luv2code.aopdemo.aspects.LuvAopExpressions.forDAOPackage()")
	public void logToCloudAsync() {
		//System.out.println("\n\n");
		System.out.println("cloud log");
	}
}

