package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	// Avante 인터페이스
	// option
	// Avante_opt1 - 기본항목(스마트스트림 가솔린 1.6 엔진, 디스크 브레이브)class door_sheet 인조가죽도어
	// Avante_opt2 - class door_sheet 인조가죽도어,하이패스 시스템 + ECM룸미러
	// Avante_opt3 - class door_sheet 인조가죽도어,하이패스 시스템 + ECM룸미러,인포테인먼트 내비
	
	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		
		Avante ava = ctx.getBean("avante",Avante.class);
		
		ava.avante_opt();
	}
}
