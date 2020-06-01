package com.javalec.exStuDto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class StuValidator implements Validator {

	// 검색 할 객체
	@Override
	public boolean supports(Class<?> clazz) {
		// StuDto에 들어있는 객체를 검색
		return StuDto.class.isAssignableFrom(clazz);
	}

	// 검증할 방법을 구현
	@Override
	public void validate(Object obj, Errors errors) {
		StuDto stuDto = (StuDto) obj;

		if (stuDto.getStu_num() == null || stuDto.getStu_num().trim().isEmpty()) {
			errors.rejectValue("학생번호", "학생번호 공백");
		}

		if (stuDto.getStu_name() == null || stuDto.getStu_name().trim().isEmpty()) {
			errors.rejectValue("학생이름", "학생이름 공백");
		}

	}

}
