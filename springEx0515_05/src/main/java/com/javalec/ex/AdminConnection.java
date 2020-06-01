package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean {

	Environment env;
	String adminId;
	String adminPw;
	
	// implements 시 오버라이딩 메소드
	public void setEnvironment(Environment env) {
		System.out.println("AdminConnection env에 값을 설정");
		setEnv(env);
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}

	public String getAdminId() {
		return adminId;
	}

	public String getAdminPw() {
		return adminPw;
	}

	public void afterPropertiesSet() throws Exception {
		
		System.out.println("AdminConnection 실행시 init 실행메소드");
		setAdminId(env.getProperty("admin.id"));
		setAdminPw(env.getProperty("admin.pw"));
		
	}
	
	public void destroy() throws Exception {
		
		System.out.println("AdminConnection 종료시 destory() 실행");
		
	}


}
