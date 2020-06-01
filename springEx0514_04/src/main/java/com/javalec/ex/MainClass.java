package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		//AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCTX.class);
		
		Student student1 = ctx.getBean("student1",Student.class);
		System.out.println("학생 1 이름 : " + student1.getName());
		System.out.println("학생 1 나이 : " + student1.getAge());
		System.out.println("학생 1 취미 : " + student1.getHobbies());
		System.out.println("학생 1 키 : " + student1.getHeight());
		System.out.println("학생 1 몸무게 : " + student1.getWeight());
		
		
	}
}
