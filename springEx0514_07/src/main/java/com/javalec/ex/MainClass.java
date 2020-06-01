package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	// Student클래스 학번/이름/전공/주소/전화번호
	//  		   1001/홍길동/컴퓨터전공/서울시/010-1111-1111
	//             1002/김유신/영문학전공/경남시/010-2222-2222
	//             1003/유관순/국문학전공/경기도/010-3333-3333
	// StuScore클래스
	/*	학번/국어/영어/수학/합계/평균
	 * 
	 * StuInfo클래스
	 * - Arraylist(Student) list
	 */
	
	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:AppCTX.xml");
		
		StuInfo stuInfo = ctx.getBean("stuInfo",StuInfo.class);
		ArrayList<Student> list = stuInfo.getList();
		StuScore stuScore = ctx.getBean("stuScore3",StuScore.class);
		
		for(int i = 0; i<list.size(); i++) {
			Student stu = list.get(i);
			if(stuScore.hak_num==stu.hak_num) {
				System.out.println("<<" + stu.name + "학생 성적 출력>>");
				System.out.print(stu.hak_num + " ");
				System.out.print(stu.name + " ");
				System.out.print(stu.major + " ");
				System.out.print(stu.livingCity + " ");
				System.out.print(stu.phone + " ");
				System.out.print(stuScore.kor + " ");
				System.out.print(stuScore.eng + " ");
				System.out.print(stuScore.math + " ");
				System.out.print(stuScore.total + " ");
				System.out.print(stuScore.avg + " ");
				System.out.println();
			}
		}
		
	}
}
