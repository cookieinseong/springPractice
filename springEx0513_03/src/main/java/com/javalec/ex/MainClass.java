package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		String config = "classpath:appCTX.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);
		
		Temperature temp = ctx.getBean("temperature", Temperature.class);
		
		temp.temperature();
		
		
		
	}
}
