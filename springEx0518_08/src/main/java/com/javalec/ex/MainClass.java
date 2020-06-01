package com.javalec.ex;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String config = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("서버를 선택하세요. 1)test 2)server");
		int num = scan.nextInt();
		
		switch (num) {
		case 1:
			config = "test";
			break;

		case 2:
			config = "server";
			break;
			
		default:
			break;
		}
		
		scan.close();
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.register(AppCTX1.class,AppCTX2.class);
		
		ctx.refresh();
		
		ServerInfo serverInfo = ctx.getBean("serverInfo", ServerInfo.class);
		
		System.out.println("서버 Ip : " + serverInfo.getIpNum());
		System.out.println("포트 : " + serverInfo.getPortNum());
		
		ctx.close();
	}

}
