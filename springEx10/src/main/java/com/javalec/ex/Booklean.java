package com.javalec.ex;

public class Booklean {
	
	private String stu_num;
	private String b_num;
	private String b_title;
	private String kind;
	private String b_date;
	private String r_date;
	private String o_date;
	public String getStu_num() {
		return stu_num;
	}
	public void setStu_num(String stu_num) {
		this.stu_num = stu_num;
	}
	public String getB_num() {
		return b_num;
	}
	public void setB_num(String b_num) {
		this.b_num = b_num;
	}
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getB_date() {
		return b_date;
	}
	public void setB_date(String b_date) {
		this.b_date = b_date;
	}
	public String getR_date() {
		return r_date;
	}
	public void setR_date(String r_date) {
		this.r_date = r_date;
	}
	public String getO_date() {
		return o_date;
	}
	public void setO_date(String o_date) {
		this.o_date = o_date;
	}
	
	public void loanInfo() {
		System.out.println("학번 : " + getStu_num());
		System.out.println("도서번호 : " + getB_num());
		System.out.println("도서제목 : " + getB_title());
		System.out.println("분류 : " + getKind());
		System.out.println("대출일자 : " + getB_date());
		System.out.println("반납일자 : " + getR_date());
		System.out.println("연체일 : " + getO_date());
	}
	
}
