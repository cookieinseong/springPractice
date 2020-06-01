package com.javalec.ex;

public class Member {
	
	// 클래스 - 파스칼표기법 : HelloWord으로 선언
	// 스네이크표기법 - hello_word : 변수명, DB
	// 카멜표기법 : 자바에서 거의다 사용
	
	// 환자 세명 기록
	
	private String mem_num; // 환자 번호
	private String name; // 환자 이름
	private int age; // 환자 나이
	private String directory; // 환자 연락처
	private String address; // 환자 주소
	private String operation_record; // 수술 기록
	
	public Member() {
		
	}
	
	public Member(String mem_num, String name, int age, String directory, String address, String operation_record) {
		this.mem_num = mem_num;
		this.name = name;
		this.age = age;
		this.directory = directory;
		this.address = address;
		this.operation_record = operation_record;
	}

	public String getMem_num() {
		return mem_num;
	}

	public void setMem_num(String mem_num) {
		this.mem_num = mem_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDirectory() {
		return directory;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOperation_record() {
		return operation_record;
	}

	public void setOperation_record(String operation_record) {
		this.operation_record = operation_record;
	}
	
	
	
}
