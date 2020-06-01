package com.javalec.ex;

import java.util.ArrayList;

public class Student {
	
	int hak_num;
	String name;
	String major;
	String livingCity;
	String phone;
	
	
	public Student() {
		
	}
	
	public Student(int hak_num, String name, String major, String livingCity, String phone) {
		this.hak_num = hak_num;
		this.name = name;
		this.major = major;
		this.livingCity = livingCity;
		this.phone = phone;
	
	}

	public int getHak_num() {
		return hak_num;
	}

	public void setHak_num(int hak_num) {
		this.hak_num = hak_num;
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

	public String getLivingCity() {
		return livingCity;
	}

	public void setLivingCity(String livingCity) {
		this.livingCity = livingCity;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
}
