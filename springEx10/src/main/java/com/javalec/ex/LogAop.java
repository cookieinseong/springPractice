package com.javalec.ex;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable{
		
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		
		try {
			
			return joinPoint.proceed();
			
		} finally {
			
			long endTime = System.currentTimeMillis();
			System.out.println(endTime);
			System.out.println("--------------------");
		}
	}
	
	public void beforeAdvice(Joinpoint joinPoint) {
		System.out.println("처음 실행되는 log");
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		
	}
	
	public void afterAdvice(Joinpoint joinPoint) {
		System.out.println("마지막에 실행되는 log");
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
	}
	
	// 메소드실행하기 전과 후
	
}
