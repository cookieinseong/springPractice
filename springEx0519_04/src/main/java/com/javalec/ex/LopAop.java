package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class LopAop {
	
	@Pointcut("within(com.javalec.ex.*)")
	public void pointcutMethod() {
		
	}
	
	@Around("within(com.javalec.ex.Book)")
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable{
		
		System.out.println("시작 시간 :" + System.currentTimeMillis());
		
		try {
			
			return joinPoint.proceed();
			
		} finally {
			
			System.out.println("마지막 시간 : " + System.currentTimeMillis());
		}
	}
	
	@Before("within(com.javalec.ex.Rental)")
	public void beforeAdvice() {
		System.out.println("시작 시간 :" + System.currentTimeMillis());
	}
	
}
