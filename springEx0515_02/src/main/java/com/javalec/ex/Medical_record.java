package com.javalec.ex;

public class Medical_record {
	
	// 회원 두명만 기록
	
	private String mem_num; // 환자 번호
	private String date; // 날짜
	private String doctor; // 의사
	private String nurse; // 간호사
	private String symptom; // 증상
	private String appointment; // 다음 방문 예약
	
	public Medical_record() {
		
	}
	
	public Medical_record(String mem_num, String date, String doctor, String nurse, String symptom, String appointment) {
		this.mem_num = mem_num;
		this.date = date;
		this.doctor = doctor;
		this.nurse = nurse;
		this.symptom = symptom;
		this.appointment = appointment;
	}

	public String getMem_num() {
		return mem_num;
	}

	public void setMem_num(String mem_num) {
		this.mem_num = mem_num;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getNurse() {
		return nurse;
	}

	public void setNurse(String nurse) {
		this.nurse = nurse;
	}

	public String getSymptom() {
		return symptom;
	}

	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

	public String getAppointment() {
		return appointment;
	}

	public void setAppointment(String appointment) {
		this.appointment = appointment;
	}
	
	
}
