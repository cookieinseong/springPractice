package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigCTX.class);
		Student student1 = ctx.getBean("student1",Student.class);
		Student student2 = ctx.getBean("student2",Student.class);
		
		System.out.println("학생 이름 : " + student1.getName());
		System.out.println("학생 이름 : " + student1.getAge());
		System.out.println("학생 이름 : " + student1.getHobbies());
		System.out.println("학생 이름 : " + student1.getHeight());
		System.out.println("학생 이름 : " + student1.getWeight());
		
		System.out.println("------------------------------------");
		
		System.out.println("학생 이름 : " + student2.getName());
		System.out.println("학생 이름 : " + student2.getAge());
		System.out.println("학생 이름 : " + student2.getHobbies());
		System.out.println("학생 이름 : " + student2.getHeight());
		System.out.println("학생 이름 : " + student2.getWeight());
	
	}
}
