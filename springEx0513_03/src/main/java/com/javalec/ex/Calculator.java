package com.javalec.ex;

public class Calculator {
	
	// 섭씨를 화씨로 변경하는 메소드
	public void nav_temp(String nav, double temp) {
		double result = temp * 1.8+32;
		
		System.out.println(nav + "의 현재 온도는 화씨" + result + "입니다.");
		
	}
}
