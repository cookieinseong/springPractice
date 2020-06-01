package com.javalec.ex;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.Dto.LoginDto;

@Controller
public class BController {

	@RequestMapping("login")
	public String login() {

		return "/login";
	}

	@RequestMapping("loginOk")
	public String loginOk(@Valid LoginDto loginDto, BindingResult result) {
		// @valid들어가면 이것들은 필요없음
//		LoginValidator validator = new LoginValidator();
//		validator.validate(loginDto, result);

		if (result.hasErrors()) {
			return "login";
		}

		return "loginOk";

	}

	// @Valid 잇으면 initBinder 메소드 만들어줘야함
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setValidator(new LoginValidator());
	}
}
