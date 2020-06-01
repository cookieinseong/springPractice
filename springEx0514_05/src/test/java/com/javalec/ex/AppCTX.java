package com.javalec.ex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCTX {
	
	@Bean
	public Student student1() {
		
		Student student1 = new Student("1001","궁예",100,80,70);
		
		return student1;
		
	}
	
	@Bean
	public Student student2() {
		
		Student student2 = new Student("1002","김유신",90,70,60);
		
		return student2;
	}
}
