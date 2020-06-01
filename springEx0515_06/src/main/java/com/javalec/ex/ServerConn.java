package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class ServerConn implements EnvironmentAware, InitializingBean, DisposableBean {

	Environment env;
	String auth;
	String driverClassName;
	String url;
	String userName;
	String password;
	String name;
	String type;
	String maxActive;
	String maxWait;

	public void setEnvironment(Environment env) {
		System.out.println("외부파일들이 모두 여기로 들어옴");
		setEnv(env); // env를 초기화
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMaxActive() {
		return maxActive;
	}

	public void setMaxActive(String maxActive) {
		this.maxActive = maxActive;
	}

	public String getMaxWait() {
		return maxWait;
	}

	public void setMaxWait(String maxWait) {
		this.maxWait = maxWait;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	public void afterPropertiesSet() throws Exception {
		
		System.out.println("가장먼저 init실행");
		setAuth(env.getProperty("auth"));
		setDriverClassName(env.getProperty("driverClassName"));
		setUrl(env.getProperty("url"));
		setUserName(env.getProperty("username"));
		setPassword(env.getProperty("password"));
		setName(env.getProperty("name"));
		setType(env.getProperty("type"));
		setMaxActive(env.getProperty("maxActive"));
		setMaxWait(env.getProperty("maxWait"));
		
	}
	public void destroy() throws Exception {
		System.out.println("destroy()실행");

	}


}
