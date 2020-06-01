package com.javalec.ex;

public class MainClass {
	
	public static void main(String[] args) {
		
		Calculation2 cal = new Calculation2(); //객체를 new()생성자 통해서 객체선언 
		
		cal.setFirstNum(10);
		cal.setSecondNum(5);
		
		Calculation cal2 = new Calculation(10,5); // 생성자를 이용해서 초기화
		
		cal.add();
		cal.sub();
		cal.multi();
		cal.divide();
		
	   
	}
}
