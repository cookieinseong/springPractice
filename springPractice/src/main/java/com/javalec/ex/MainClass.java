package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// load,fresh
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:appCTX.xml");
		ctx.refresh();
		
		Student student1 = ctx.getBean("student",Student.class);
		
		System.out.println("학생 이름 : " + student1.getName());
		System.out.println("학생 나이 : " + student1.getAge());
		ctx.close();
		
	}
}
