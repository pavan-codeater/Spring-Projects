package com.luv2code.aopdemo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(-1)
public class MyApiAnalyticsAspect {
	
	@Before("com.luv2code.aopdemo.aspects.LuvAopExpressions.forDAOPackage()")
	public void performApiAnalytics(JoinPoint jp) {

		MethodSignature ms=(MethodSignature) jp.getSignature();
		
		System.out.println("the method signature "+ms);
		
		System.out.println("API Analytics");
		
		
		
		
		
	}
	
	
}
