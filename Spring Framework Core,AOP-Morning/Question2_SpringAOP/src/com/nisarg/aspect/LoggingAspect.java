package com.nisarg.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	//This is called before all getters method
	@Before("allGetters()")
	public void BeforeAdvice() {
		System.out.println("Advice Before being called");
	}
	
	//This is called after all getters method 
	@After("allGetters()")
	public void AfterAdvice() {
		System.out.println("Advice After being called ");
	}

	//This is called after the set method returns successfully
	@AfterReturning("args(name)")
	public void AfterReturningAdvice(String name) {
		System.out.println("Advice After succesfully returning and the value set is" + name);
	}

	//This is called after the set method does not return successfully and throwing an error
	@AfterThrowing(pointcut = "args(name)", throwing = "ex")
	public void throwingException(String name, Exception ex) {
		System.out.println("Advice After throwing exception and the name of exception is " + ex.toString());
	}

	//This is called before and after the set method called
	@Around("args(String,String)")
	public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		Object returnvalue = null;
		System.out.println("Advice Around being called");
		try {
			returnvalue = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			
		}
		return returnvalue;
	}
	

	//Define pointcut expression
	@Pointcut("execution(* get*())")
	public void allGetters() {
	}
	

}
