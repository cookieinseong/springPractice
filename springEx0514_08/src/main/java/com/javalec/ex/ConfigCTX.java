package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:AppCTX.xml")
public class ConfigCTX {
	// xml 파일을 자바에다 삽입하는 모양
	
	@Bean
	public Student student1() {
		
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("수영");
		hobbies.add("조깅");
		hobbies.add("등산");
		
		Student student1 = new Student("김유신",33,hobbies);
		student1.setHeight(180);
		student1.setWeight(70);
		
		return student1;
	}
	
}
