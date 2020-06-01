package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCTX {
	
	// 1. appCTX.xml
	// 2. <bean id = "student" class = "com.javalec.ex.Student">
	// 3. <constructor-arg value = "홍길동" />
	// 4. <property name = "" value = ""/>
	
	
	@Bean
	public Student student1() {
		
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("웹툰");
		hobbies.add("게임");
		hobbies.add("독서");
		
		Student student1 = new Student("홍길동", 30, hobbies);
		student1.setHeight(175);
		student1.setWeight(65);
		
		return student1;
		
	}
	
	@Bean
	public Student student2() {
		
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("수영");
		hobbies.add("야구");
		hobbies.add("축구");
		
		Student student2 = new Student("김유신", 30, hobbies);
		student2.setHeight(165);
		student2.setWeight(55);
		
		return student2;
	}
	
	
}
