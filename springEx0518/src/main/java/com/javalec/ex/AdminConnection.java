package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean {
	
	private Environment env;
	private String adminId;
	private String adminPw;
	
	
	// 클래스 생성 전 env값 호출
	public void setEnvironment(Environment env) {
		System.out.println("setEnvironement()");
		setEnv(env); // env객체를 env변수에 입력
		
	}
	
	//xml에서 bean객체 생성시 실행
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
		setAdminId(env.getProperty("admin.id"));
		setAdminPw(env.getProperty("admin.pw"));
	}
	
	// xml에서 bean객체 소멸시 실행
	public void destroy() throws Exception {
		System.out.println("xml에서 bean객체가 소멸할때 실행 destroy()");

	}

	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminPw() {
		return adminPw;
	}

	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
	
	
	

}
