package com.javalec.ex;

public class StudentInfo {

	private String stu_num;
	private String name;
	private String major;
	private String address;
	private String tel;
	
	public String getStu_num() {
		return stu_num;
	}
	public void setStu_num(String stu_num) {
		this.stu_num = stu_num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public void studentInfo() {
		System.out.println("학번 : " + getStu_num());
		System.out.println("이름 : " + getName());
		System.out.println("전공 : " + getMajor());
		System.out.println("학번 : " + getAddress());
		System.out.println("학번 : " + getTel());
	}
}
