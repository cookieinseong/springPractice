package com.javalec.ex;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

public class Validator implements org.springframework.validation.Validator {

	// 검색할 객체
	@Override
	public boolean supports(Class<?> clazz) {

		return JoinMember.class.isAssignableFrom(clazz);

	}

	// 검증할 방법 구현
	@Override
	public void validate(Object obj, Errors errors) {

		JoinMember joinMember = (JoinMember) obj; // id와 pw 들어있음

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "id공백에러");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pw", "pw공백에러");

	}

}
