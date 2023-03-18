package com.luv2code.aopdemo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Aspect
@Component
@Order(100)
public class MyDemoLoggingAspect {

	
	
	@Before("com.luv2code.aopdemo.aspects.LuvAopExpressions.forDAOPackage()")
	public void beforeAddAccountAdvice(JoinPoint jp) {
		System.out.println("logging");
		
		Object[] ar=jp.getArgs();
		
		
		for(Object a:ar) {
			
			if(a instanceof Account) {
				Account theAccount=(Account) a;
				
				System.out.println(theAccount.getName());
			}
			
			
		}
		
		
	}
	

}
