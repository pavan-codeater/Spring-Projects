package com.luv2code.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	private void forDAOPackage() {}
	
	@Pointcut("execution")
	
	
	
	@Before("forDAOPackage()")
	public void beforeAddAcoountAdvice() {
		System.out.println("logging");
	}
	
	@Before("forDAOPackage()")
	public void performApiAnalytics() {
		//System.out.println("\n\n");
		System.out.println("API Analytics");
	}
	
	
	
	
}
