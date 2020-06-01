package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Member_all implements InitializingBean, DisposableBean{
	
	ArrayList<Member> list;
	
	public Member_all() {
		
	}
	
	public Member_all(ArrayList<Member> list) {
		this.list = list;
	}

	public ArrayList<Member> getList() {
		return list;
	}

	public void setList(ArrayList<Member> list) {
		this.list = list;
	}

	public void destroy() throws Exception {
		System.out.println("Member_all + destroy()");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Member_all + afterPro()실행");
		
	}
	
	
}
