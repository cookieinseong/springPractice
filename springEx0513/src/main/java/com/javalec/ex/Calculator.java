package com.javalec.ex;

public class Calculator {
	
	// 실행하는 메소드들만 존재
	public void addition(int f, int s) {
		System.out.println("addition");
		int result = f + s;
		System.out.println("f+s = " + result);
	}
	public void subtraction(int f, int s) {
		System.out.println("subtraction");
		int result = f - s;
		System.out.println("f-s = " + result);
	}
	public void multiplication(int f, int s) {
		System.out.println("multiplication");
		int result = f * s;
		System.out.println("f*s = " + result);
	}
	public void division(int f, int s) {
		System.out.println("addition");
		int result = f / s;
		System.out.println("f/s = " + result);
	}
}
