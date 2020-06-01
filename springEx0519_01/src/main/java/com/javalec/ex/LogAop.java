package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	// <aop:around> : 메서드 실행 전/후 실행 <aop 구현>
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable{
		// 시작전 실행 명령
		System.out.println("(around)메소드 시작시간 : " + System.currentTimeMillis());
		
		try {
			return joinPoint.proceed(); // 실행 메소드를 호출
			
		} finally {
			System.out.println("(around)메소드 종료시간 : " + System.currentTimeMillis());
		}
	}
	// before
	public void beforeAdvice() {
		System.out.println("(before)메소드 시작시간 : " + System.currentTimeMillis());
	}
	
	
	
	
}
