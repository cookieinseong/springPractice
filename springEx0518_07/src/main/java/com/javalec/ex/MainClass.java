package com.javalec.ex;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		String config = "";
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i<3; i++) {
		
		System.out.println("번호를 선택해보아요.");
		int num = scan.nextInt();
			
		switch (num) {
		case 1:
			config = "chrome";
			break;

		case 2 :
			config = "table";
			break;
		
		case 3 :
			config = "android";
			break;
		}
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.load("appCTX1.xml","appCTX2.xml","appCTX3.xml");
		ctx.refresh();
		
		Environment environment = ctx.getBean("environment",Environment.class);
		
		System.out.println("브라우저 : " + environment.getBrowser());
		System.out.println("IP : " + environment.getIpNum());
		System.out.println("접속 : " + environment.getConnection());
		}
		
		
		
	}
}
