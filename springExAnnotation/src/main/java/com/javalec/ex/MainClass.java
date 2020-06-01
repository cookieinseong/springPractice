package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigCTX.class);
		
		Student student1 = ctx.getBean("student1",Student.class);
		
		student1.stuPrint();
		
		AbstractApplicationContext ctx2 = new GenericXmlApplicationContext("classpath:appCTX.xml");
		
		Student student2 = ctx2.getBean("student2",Student.class);
		student2.stuPrint();
	}
}
