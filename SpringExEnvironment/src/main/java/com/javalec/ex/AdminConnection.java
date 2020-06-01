package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements EnvironmentAware,InitializingBean, DisposableBean{
	
	private Environment env; // admin.properties 값이 들어가게 된다.
	private String adminId;
	private String adminPw;
	
	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		//class가 생성되기전에 이곳으로 properties 값으로 들어감
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

	public void setEnvironment(Environment env) {
		System.out.println("setEnvironment 설정");
		setEnv(env);
	}
	
	public void destroy() throws Exception {
		System.out.println("destroy()");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("init()");
		setAdminId(env.getProperty("admin.id"));
		setAdminPw(env.getProperty("admin.pw"));
		
	}


}
