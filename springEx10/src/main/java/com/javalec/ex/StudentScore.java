package com.javalec.ex;

public class StudentScore {
	
	private String stu_num;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	public StudentScore() {
		
	}
	
	public StudentScore(String stu_num, int kor, int eng, int math) {
		this.stu_num=stu_num;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.total = kor+eng+math;
		this.avg = total/3;
	}
	
	public String getStu_num() {
		return stu_num;
	}
	public void setStu_num(String stu_num) {
		this.stu_num = stu_num;
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
	
	public void studentScore() {
		
		System.out.println("학번 : " + getStu_num());
		System.out.println("국어 : " + getKor());
		System.out.println("영어 : " + getEng());
		System.out.println("수학 : " + getMath());
		System.out.println("합계 : " + getTotal());
		System.out.println("평균 : " + getAvg());
		
	}
	
}
