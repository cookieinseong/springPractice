package com.javalec.ex;


import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:appCTX.xml");
		ctx.refresh();
		
		Student student1 = ctx.getBean("student",Student.class);
		// 둘다 같음
		Student student2 = ctx.getBean("student",Student.class);
		
		System.out.println("학생 이름 : " + student1.getName());
		System.out.println("학생 나이 : " + student1.getAge());
		System.out.println("--------------------------------");
		
		student2.setName("김유신");
		student2.setAge(30);
		
		System.out.println("학생 이름 : " + student1.getName());
		System.out.println("학생 나이 : " + student1.getAge());
		
		if(student1.equals(student2)) {
			System.out.println("2개 객체는 같습니다.");
		} else {
			System.out.println("2개 객체는 다릅니다.");
		}
		
		ctx.close();
	}
}
