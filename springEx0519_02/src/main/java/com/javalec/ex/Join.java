package com.javalec.ex;

public class Join {

	private String mem_num;
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_joinDate;
	
	public String getMem_num() {
		return mem_num;
	}
	public void setMem_num(String mem_num) {
		this.mem_num = mem_num;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_pw() {
		return m_pw;
	}
	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_joinDate() {
		return m_joinDate;
	}
	public void setM_joinDate(String m_joinDate) {
		this.m_joinDate = m_joinDate;
	}
	
	public void joinPrint() {
		System.out.println("회원번호 : " + getMem_num());
		System.out.println("회원ID : " + getM_id());
		System.out.println("회원PW : " + getM_pw());
		System.out.println("회원이름 : " + getM_name());
		System.out.println("회원등록일 : " + getM_joinDate());
		
	}
	
	
}
