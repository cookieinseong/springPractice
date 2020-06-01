package com.javalec.ex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class AppCTX {
	
	@Value("${line}")
	private String line;
	@Value("${station}")
	private String station;
	@Value("${address1}")
	private String address1;
	@Value("${address2}")
	private String address2;
	@Value("${telNo}")
	private String telNo;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer configurer() {
		
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		
		Resource location = new ClassPathResource("line.properties");
		
		configurer.setLocation(location);
		
		return configurer;
		
	}
	
	@Bean
	public Line line() {
		
		Line lineInfo = new Line();
		
		lineInfo.setLine(line);
		lineInfo.setLine(station);
		lineInfo.setLine(address1);
		lineInfo.setLine(address2);
		lineInfo.setLine(telNo);
		
		return lineInfo;
	}
}
