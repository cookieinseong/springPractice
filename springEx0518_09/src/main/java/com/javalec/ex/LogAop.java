package com.javalec.ex;


import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {

	// proxy를 하나 만들어 주는것 공통부분 처리
	// xml에 선언해줄것임
	// 대행클래스 1번째 메소드( 처음과 마지막에 실행되는 메소드 )
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable{
		
		// System.out.println("조인포인트 실행");
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		
		try {
			
			return joinPoint.proceed();
			
		}  finally {
			
			long endTime = System.currentTimeMillis();
			System.out.println(endTime);
			System.out.println("---------------------");
			
		}
	} // 메소드를 실행하기 전과 후 
	
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
	
}
