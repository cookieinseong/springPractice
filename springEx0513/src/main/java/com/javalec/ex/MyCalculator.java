package com.javalec.ex;

public class MyCalculator {
	
	int firstNum;
	int secondNum;
	Calculator calculator;
	
	public Calculator getCalculator() {
		return calculator;
	}
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public void add() {
		calculator.addition(firstNum, secondNum);
	}
	public void sub() {
		calculator.subtraction(firstNum, secondNum);
	}
	public void multiply() {
		calculator.multiplication(firstNum, secondNum);
	}
	public void divide() {
		calculator.division(firstNum, secondNum);
	}
	
}
