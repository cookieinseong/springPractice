package com.javalec.ex;

public class StuProcess {
	
	char result;
	
	public void score(double avg) {
		
		if(avg>=90) {
			result = 'A';
		} else if (avg>=80) {
			result = 'B';
		} else if (avg>=70) {
			result = 'C';
		} else if (avg>=60){
			result = 'D';
		} else {
			result = 'F';
		}
		
		System.out.println("학점은" + result + "입니다.");
	}
	
}
