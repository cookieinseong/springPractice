package com.javalec.ex;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {
	
	public static void main(String[] args) {
		
		// admin.properties에 값들을 삽입
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		MutablePropertySources propertySource = env.getPropertySources();
		// propertySource에다가 admin.properties의 값이 들어감
		
		try {
			
			propertySource.addLast(new ResourcePropertySource("classpath:admin.properties"));
			System.out.println(env.getProperty("admin.id"));
			System.out.println(env.getProperty("admin.pw"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		GenericXmlApplicationContext ctx2 = (GenericXmlApplicationContext)ctx;
		
		ctx2.load("classpath:appCTX.xml");
		ctx2.refresh();
		
		AdminConnection adminConnection = ctx2.getBean("adminConnection",AdminConnection.class);
		
		System.out.println("ID : " + adminConnection.getAdminId());
		System.out.println("PW : " + adminConnection.getAdminPw());
		
		ctx.close();
		ctx2.close();
	}
}
