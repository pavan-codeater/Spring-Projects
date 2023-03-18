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
	
	
//	
//	@Pointcut("expression(* com.luv2code.aopdemo.dao.*.get*(..))")
//	private void getter() {}
//	
//	@Pointcut("expression(* com.luv2code.aopdemo.dao.*.set*(..))")
//	private void setter() {}
//	
//	@Pointcut("forDAOPackage() && !(getter() || seter())")
//	private void forDAOPackageNoGetterSetter() {}
//	
//	
	
	
	@Before("forDAOPackage()")
	public void beforeAddAccountAdvice() {
		System.out.println("logging");
	}
	
	@Before("forDAOPackage()")
	public void performApiAnalytics() {
		//System.out.println("\n\n");
		System.out.println("API Analytics");
	}
}
