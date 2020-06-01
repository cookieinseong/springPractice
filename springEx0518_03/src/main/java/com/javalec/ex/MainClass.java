package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("appCTX.xml");
		ctx.refresh();
		Server server = ctx.getBean("server",Server.class);
		
		System.out.println(server.getAuth());
		System.out.println(server.getDriverClassName());
		System.out.println(server.getUrl());
		System.out.println(server.getUserName());
		System.out.println(server.getPassword());
		
		System.out.println(server.getName());
		System.out.println(server.getType());
		System.out.println(server.getMaxActive());
		System.out.println(server.getMaxWait());
	}
	
}
