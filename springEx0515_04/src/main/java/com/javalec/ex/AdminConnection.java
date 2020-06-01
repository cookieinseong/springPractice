package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
									// admin.properties에 있는 값을 들고오려면 EnvironementAware 필요 외부환경에 파일을 모아놓은 집합체
public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean {
	// 생성되자 마자 값을 할당하고 싶음 : 1. 자바를 알고 있따면 bean 2. admin.properties
	
	private Environment env; // admin.properties에 값이 들어가 있음 (env를 클래스로 가지고오고 싶을떄) 
	private String adminId; 
	private String adminPw;

	// AdminConnection 시작전 실행해서 값을 할당
	// classpath를 이용해서 값을 할당함
	public void setEnvironment(Environment env) {
		System.out.println("setEnvironment 설정 됨");
		setEnv(env);
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
	
	//init() 객체생성시 실행
	// 생성하자마자 admin_id와 admin_pw에 삽입
	public void afterPropertiesSet() throws Exception {
		System.out.println("객체 생성시 admin_id,pw 값을 할당");
		setAdminId(env.getProperty("admin_id"));
		setAdminPw(env.getProperty("admin_pw"));
	}

	public void destroy() throws Exception {
		System.out.println("빈 객체 종료");

	}

}
