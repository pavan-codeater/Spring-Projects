package com.luv2code.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(100)
public class MyDemoLoggingAspect {

	
	
	@Before("com.luv2code.aopdemo.aspects.LuvAopExpressions.forDAOPackage()")
	public void beforeAddAccountAdvice() {
		System.out.println("logging");
	}
	

}
