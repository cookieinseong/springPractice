package com.javalec.ex;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.javalec.ex.Dto.LoginDto;

public class LoginValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// 어떤 클래스를 가져와서 유효성 검사를 할것인지.
		return LoginDto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		LoginDto loginDto = (LoginDto) target;

		if (loginDto.getId() == null || loginDto.getId().trim().isEmpty()) {
			System.out.println("id빈공백에러");
			errors.rejectValue("id", "id빈공백에러");
		}

		if (loginDto.getPw() == null || loginDto.getPw().trim().isEmpty()) {
			System.out.println("pw빈공백에러");
			errors.rejectValue("pw", "pw빈공백에러");
		}

		if (loginDto.getName() == null || loginDto.getName().trim().isEmpty()) {
			System.out.println("name빈공백에러");
			errors.rejectValue("name", "name빈공백에러");
		}
	}

}
