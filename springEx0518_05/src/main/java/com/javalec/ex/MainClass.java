package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCTX.class);
		
		Line line = ctx.getBean("line", Line.class);
		
		System.out.println(line.getLine());
		System.out.println(line.getStation());
		System.out.println(line.getAddress1());
		System.out.println(line.getAddress2());
		System.out.println(line.getTelNo());
		ctx.close();
	}
}
