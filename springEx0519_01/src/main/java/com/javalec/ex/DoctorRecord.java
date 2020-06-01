package com.javalec.ex;

public class DoctorRecord {

	private int mem_num;
	private String mem_name;
	private String doctor;
	private String date;
	
	public void doctor_print() {
		System.out.println("환자회원정보 : "+getMem_num()+"/"+getMem_name());
	}
	
	public int getMem_num() {
		return mem_num;
	}
	public void setMem_num(int mem_num) {
		this.mem_num = mem_num;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
}
