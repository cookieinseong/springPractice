package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		// 유관순에 대한 인적사항과 오늘 치료 기록을 출력
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:AppCTX.xml");
		Member_all member = ctx.getBean("Member_all",Member_all.class);
		
		Medical_record record1 = ctx.getBean("Medical_record1",Medical_record.class);
		
		for(int i = 0; i<member.list.size(); i++) {
			
			if(member.list.get(i).getMem_num() == record1.getMem_num()) {
				
				System.out.println("환자 번호 : " + member.list.get(i).getMem_num());
				System.out.println("환자 이름 : " + member.list.get(i).getName());
				System.out.println("환자 나이 : " + member.list.get(i).getAge());
				System.out.println("환자 연락처 : " + member.list.get(i).getDirectory());
				System.out.println("환자 주소 : " + member.list.get(i).getAddress());
				System.out.println("환자 수술기록 : " + member.list.get(i).getOperation_record());
				System.out.println("환자 이름 : " + member.list.get(i).getName());
				System.out.println("진료 날짜 : " + record1.getDate());
				System.out.println("진료 의사 : " + record1.getDoctor());
				System.out.println("진료 간호사 : " + record1.getNurse());
				System.out.println("증상 : " + record1.getSymptom());
				System.out.println("내원 날짜 : " + record1.getAppointment());
				
				
			}
			
		}

	}

}
