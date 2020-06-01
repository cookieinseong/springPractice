package com.javalec.ex;

public class Student {
	
	String hak_num;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	
	
	public String getHak_num() {
		return hak_num;
	}

	public void setHak_num(String hak_num) {
		this.hak_num = hak_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public Student() {
		
	}
	
	public Student(String hak_num, String name, int kor, int eng, int math) {
		
		this.hak_num = hak_num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = total / 3.0;
		
	}
	
	void printArr() {
		System.out.println("학번 : " + hak_num);
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("------------------");
	}
}
