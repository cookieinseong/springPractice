package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCTX.class);
		
		Student student1 = ctx.getBean("student1", Student.class);
		
		System.out.println("학번 : " + student1.getHak_num());
		System.out.println("이름 : " + student1.getName());
		System.out.println("국어 : " + student1.getKor());
		System.out.println("영어 : " + student1.getEng());
		System.out.println("수학 : " + student1.getMath());
		System.out.println("합계 : " + student1.getTotal());
		System.out.println("평균 : " + student1.getAvg());
		System.out.println("-----------------------------");
		
		Student student2 = ctx.getBean("student2", Student.class);
		
		System.out.println("학번 : " + student2.getHak_num());
		System.out.println("이름 : " + student2.getName());
		System.out.println("국어 : " + student2.getKor());
		System.out.println("영어 : " + student2.getEng());
		System.out.println("수학 : " + student2.getMath());
		System.out.println("합계 : " + student2.getTotal());
		System.out.println("평균 : " + student2.getAvg());
		
		
		
	}
}
