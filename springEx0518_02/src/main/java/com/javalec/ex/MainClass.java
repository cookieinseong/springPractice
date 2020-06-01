package com.javalec.ex;


import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("appCTX.xml");
		ctx.refresh();
		
		AdminConnection adminConnection = ctx.getBean("adminConnection",AdminConnection.class);
		
		System.out.println("adminId : " + adminConnection.getAdminId());
		System.out.println("adminPw : " + adminConnection.getAdminPw());
		System.out.println("sub_adminId : " + adminConnection.getSub_adminId());
		System.out.println("sub_adminPw : " + adminConnection.getSub_adminPw());
		
		ctx.close();
		
	}

}
