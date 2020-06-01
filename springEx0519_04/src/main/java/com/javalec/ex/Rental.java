package com.javalec.ex;

public class Rental {
	
	private int memNum;
	private String name;
	private String retalBook;
	private String returning;
	private String address;
	
	public int getMemNum() {
		return memNum;
	}
	public void setMemNum(int memNum) {
		this.memNum = memNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRetalBook() {
		return retalBook;
	}
	public void setRetalBook(String retalBook) {
		this.retalBook = retalBook;
	}
	public String getReturning() {
		return returning;
	}
	public void setReturning(String returning) {
		this.returning = returning;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void rentalPrint() {
		System.out.println("회원 번호 :" + getMemNum());
		System.out.println("회원 번호 :" + getName());
		System.out.println("회원 번호 :" + getRetalBook());
		System.out.println("회원 번호 :" + getReturning());
		System.out.println("회원 번호 :" + getAddress());
	}
	
	
	
}
