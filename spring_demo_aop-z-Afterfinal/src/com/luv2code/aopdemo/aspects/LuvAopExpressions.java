package com.luv2code.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect


public class LuvAopExpressions {

	

	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	public void forDAOPackage() {}
	
	

	/*
	 * @Pointcut("expression(* com.luv2code.aopdemo.dao.*.get* (..))") public void
	 * getter() {}
	 */
	
//	@Pointcut("expression(* com.luv2code.aopdemo.dao.*.set*(..))")
//	public void setter() {}
//	
//	@Pointcut("forDAOPackage() && !(getter() || setter())")
//	public void forDAOPackageNoGetterSetter() {}
//	
	
	
}
