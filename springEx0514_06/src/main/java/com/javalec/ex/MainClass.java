package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		// AnnotationApplicationContext ctx = new AnnotationApplicationContext(ConfigCtx.class);
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:AppCTX.xml");
		
		Student student1 = ctx.getBean("student1",Student.class);
		
		student1.get_stuPrint();
		
		Student student2 = ctx.getBean("student2",Student.class);
		
		student2.get_stuPrint();
		
		
		
	}
}
