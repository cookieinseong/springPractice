package com.javalec.ex;

public class StudentInfo {
	
	Student student;
	
	public StudentInfo() {
		
	}
	
	// 생성자
	public StudentInfo(Student student) {
		this.student = student;
	}
	
	// setter
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void getStudentInfo() {
		if(student!=null) {
			System.out.println("학생이름 : " + student.getName());
			System.out.println("학생 나이 : " + student.getAge());
			System.out.println("학년 : " + student.getGradeNum());
			System.out.println("학번 : " + student.getClassNum());
			System.out.println("------------------------------");
		}
	}
	
	
	
	
	
	
	
	
	
	
}
