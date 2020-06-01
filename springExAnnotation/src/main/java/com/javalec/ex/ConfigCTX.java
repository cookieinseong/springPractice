package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCTX {
	
	@Bean
	public Student student1() {
		
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("웹툰");
		hobbies.add("게임");
		hobbies.add("독서");
		
		// 자바를 통해서 student객체를 초기화
		Student student1 = new Student("홍길동",30,hobbies);
		student1.setHeight(182);
		student1.setWeight(70);
		
		return student1;
	}
}
