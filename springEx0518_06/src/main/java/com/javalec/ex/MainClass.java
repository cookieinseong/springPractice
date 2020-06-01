package com.javalec.ex;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String config = "";
		System.out.println("서버를 선택해주세요.1)test-server 2)실제-server");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		switch (num) {
		
		case 1:
			config="test";
			break;

		case 2:
			config="server";
			break;
		}
		
		scan.close();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.load("appCTX1.xml","appCTX2.xml");
		ctx.refresh();
		
		ServerInfo serverInfo = ctx.getBean("serverInfo",ServerInfo.class);
		
		System.out.println("서버 접속 완료");
		
		System.out.println("접속 IP : " + serverInfo.getIpNum());
		
		System.out.println("접속 Port : " + serverInfo.getPortNum());
		
		System.out.println("--------------------------------------");
		
		System.out.println("Url : " + serverInfo.getIpNum() + " : " + serverInfo.getPortNum());
		
		ctx.close();
		

	}

}
