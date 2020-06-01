package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	// student 클래스 
	// 학번 / 이름 / 국어 / 영어 / 수학 / 합계 / 평균
	// 메인클래스에서 2명의 학생의 학번 / 이름 / 국어 / 영어 / 수학 / 합계 / 평균
	// xml파일에서는 2명의 학생의 정보를 주입
	// 방법은 생성자 방법(학번, 이름, 국어, 영어, 수학 - 매개변수)
	
	public static void main(String[] args) {
	
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		
		Student stu = ctx.getBean("student",Student.class);
		
		stu.printArr();
		
		Student stu2 = ctx.getBean("student2",Student.class);
		
		stu2.printArr();
	}
}