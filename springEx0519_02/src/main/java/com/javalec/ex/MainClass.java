package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		Join join = ctx.getBean("join",Join.class);
		join.joinPrint();
		
		EventBoard eventBaord =ctx.getBean("eventBoard",EventBoard.class);
	
	}

}
