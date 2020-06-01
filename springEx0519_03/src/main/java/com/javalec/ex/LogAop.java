package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {
	
	@Pointcut("within(com.javalec.ex.*)")
	private void pointcutMethod() {
		
	}
	
	@Around("within(com.javalec.ex.Student)")
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable{
		
		System.out.println("(around)시작시간 : " + System.currentTimeMillis());
		
		try {
			return joinPoint.proceed();
				
		} finally {
			System.out.println("(around)종료시간 : " + System.currentTimeMillis());
		}
	}
	
	@Before("within(com.javalec.ex.Worker)")
	public void beforeAdvice() {
		System.out.println("(before)시작시간 : " + System.currentTimeMillis());
	}
	
	@After("pointcutMethod()")
	public void afterAdvice() {
		System.out.println("(after)종료 시간 : " + System.currentTimeMillis());
	}
	
}
