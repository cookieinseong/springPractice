package com.javalec.ex;

public class MainClass {

	public static void main(String[] args) {
		MyCalculator myCal = new MyCalculator();
		myCal.setCal(new Calculator());
		
		myCal.setFirstNum(10);
		myCal.setSecondNum(5);
		
		myCal.add();
		myCal.sub();
		myCal.multi();
		myCal.divide();
	}

}
