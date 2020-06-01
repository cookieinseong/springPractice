package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
	
		// applicationCTX의 위치를 알아야 한다. 그래야만 xml파일 사용 가능
		String configLocation = "classpath:applicationCTX.xml"; //src/main/resources
		// xml을 불러오기 위해서는 GenericXmlApplicationContext객체가 필요하다
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		//xml에 있는 변수를 들고 올건데 MYCalculator클래스를 가지고와서 myCalculator변수에 저장하겠다는 의미
		MyCalculator myCalculator = ctx.getBean("myCalculator",MyCalculator.class);
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.multiply();
		myCalculator.divide();
		
		
//		MyCalculator myCalculator = new MyCalculator();
//	
//		myCalculator.setCalculator(new Calculator());
//	
//		myCalculator.setFirstNum(10);
//		myCalculator.setSecondNum(2);
		
//		myCalculator.add();
//		myCalculator.sub();
//		myCalculator.multiply();
//		myCalculator.divide();
	
	}
}
