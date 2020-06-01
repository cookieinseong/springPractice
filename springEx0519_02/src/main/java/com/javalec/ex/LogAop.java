package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	// AoP
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable{
		// 시작전 실행 명령
		System.out.println("(around)메소드 시작시간 : " + System.currentTimeMillis());
		
		try {
			return joinPoint.proceed();
			
		} finally {
			
			System.out.println("(around)메소드 종료시간 : " + System.currentTimeMillis());
			
		}
		
	}
	
	// before
	public void beforeAdvice() {
		System.out.println("(before)메소드 시작 시간 : " + System.currentTimeMillis());
	}
}
