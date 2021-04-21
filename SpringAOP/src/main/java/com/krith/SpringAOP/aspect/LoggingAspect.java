package com.krith.SpringAOP.aspect;

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

	@Before("allGetters()") //Wildcard @Before("execution(public * get*())") In case .. - Any number of arguments [0 or more arg] and * for [1 or more number of args]
	//Incase of Poincut() expression of line 24 we must change to @Before("allTyreMethods()")
	public void loggingAdvice() {
		System.out.println("Logging method is called");
	}
	
	@After("allGetters()")
	public void secondAdvice() {
		System.out.println("A piece of advice from second logging");
	}
	
	@Before("args(value)")
	public void printingArgName(String value) {
		System.out.println("The object is "+value);
	}
	
	@Pointcut("execution(public String get*())")	//If same Pointcut/expression is used inorder to run the aspect we could use Pointcut annotation
	public void allGetters() {}
	
	/*
	@AfterReturning("allGetters()")
	public void methodRunsSuccesful() {
		System.out.println("This logging would run only if the method executes successfully");
	}
	*/
	
	/*@AfterThrowing("execution(public void setColor(..))")
	public void methodThrowsExcep() {
		System.out.print("This logging aspect would run even if method throws exception");
	}*/
	
	@Around("execution(public void setColor(..))")
	public void aroundAnnot(ProceedingJoinPoint proceedJoin) {
		try {
			System.out.println("Before processing the method");
			proceedJoin.proceed();		//In case of return statement returnvalue=proceedJoin.proceed();
			System.out.println("After processing the method");
		}
		catch (Throwable e) {
			System.out.println("In case of exception");
		}
	}
	
	@Pointcut("within(com.krith.SpringAOP.model.Tyre)")
	public void allTyreMethods() {}
	
	@Around("@annotation(com.krith.SpringAOP.aspect.Loggable)")
	public void CustomLogs() {
		System.out.println("A piece of advice from Custom annotation");
	}
}
