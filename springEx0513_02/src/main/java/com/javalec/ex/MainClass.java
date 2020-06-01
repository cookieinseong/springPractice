package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	
	public static void main(String[] args) {
		// applicationCTX의 위치를 먼저 확인
		String configLocation = "classpath:applicationCTX.xml";
		// xml을 불러오기 위해서는 GenericApplicationContext
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		StuScore stuScore = ctx.getBean("StuScore",StuScore.class);
		System.out.println("학생번호 : " + stuScore.stu_num);
		System.out.println("학생이름 : " + stuScore.stu_name);
	
		stuScore.result_score();
	}

}
