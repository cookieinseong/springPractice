package com.javalec.ex;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass{
	
	public static void main(String[] args) {
	
	ConfigurableApplicationContext ctx = new GenericXmlApplicationContext(); // 변수
	ConfigurableEnvironment env = ctx.getEnvironment(); // 변수를 객체에
	MutablePropertySources propertySource = env.getPropertySources(); // 어레이
	
	try {
		propertySource.addLast(new ResourcePropertySource("classpath:Server.properties"));
		System.out.println(env.getProperty("auth"));
		System.out.println(env.getProperty("driverClassName"));
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	GenericXmlApplicationContext ctx2 = (GenericXmlApplicationContext)ctx;
	ctx2.load("AppCTX.xml");
	ctx2.refresh();
	
	ServerConn serverconn = ctx2.getBean("serverconn",ServerConn.class);
	
	System.out.println(serverconn.getAuth());
	System.out.println(serverconn.getDriverClassName());
	System.out.println(serverconn.getUrl());
	System.out.println(serverconn.getUserName());
	System.out.println(serverconn.getPassword());
	System.out.println(serverconn.getName());
	System.out.println(serverconn.getType());
	System.out.println(serverconn.getMaxActive());
	System.out.println(serverconn.getMaxWait());
	
	ctx2.close();
	ctx.close();
	
	
	
	}
	
	
}
