package com.javalec.ex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class appCTX {
	
	@Value("${auth}")
	private String auth;
	@Value("${driverClassName")
	private String driverClassName;
	@Value("${url}")
	private String url;
	@Value("${userName")
	private String userName;
	@Value("${password}")
	private String password;
	@Value("${name}")
	private String name;
	@Value("${type}")
	private String type;
	@Value("${maxActive}")
	private String maxActive;
	@Value("${maxWait}")
	private String maxWait;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
				  // 메소드 형태로 PropertySourcesPlaceholderConfigurer 반드시 만들어 줘야 함
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		
		Resource[] location = new Resource[2];
		
		location[0] = new ClassPathResource("server1.properties");
		location[1] = new ClassPathResource("server2.properties");
		
		// Resource location = new ClassPathResource("server1.properties");
		
		configurer.setLocations(location);
		
		return configurer;  
	}
	
	@Bean
	public ServerInfo serverInfo() {
		
		ServerInfo serverInfo = new ServerInfo();
		serverInfo.setAuth(auth);
		serverInfo.setDriverClassName(driverClassName);
		serverInfo.setUrl(url);
		serverInfo.setUserName(userName);
		serverInfo.setPassword(password);
		serverInfo.setName(name);
		serverInfo.setType(type);
		serverInfo.setMaxActive(maxActive);
		serverInfo.setMaxWait(maxWait);
		
		return serverInfo;
	}
}
