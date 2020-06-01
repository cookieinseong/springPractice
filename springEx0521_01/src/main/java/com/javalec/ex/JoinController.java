package com.javalec.ex;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.dto.LoginDto;
import com.javalec.ex.dto.LoginValidator;
import com.javalec.ex.dto.MemberDto;
import com.javalec.ex.dto.StudentDto;

@Controller
public class JoinController {

	@RequestMapping("/input")
	public String input() {
		return "/input";
	}

	@PostMapping("inputOk")
	public String inputOk(@Valid LoginDto loginDto, BindingResult result) {

		String page = "inputOk";

		// LoginValidator validator = new LoginValidator();
		// validator.validate(loginDto, result);

		if (result.hasErrors()) {
			page = "input";
		}

		return page;
	}

	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new LoginValidator());
	}

	@RequestMapping("/join")
	public String join() {

		return "/join";
	}

	@RequestMapping("/main")
	public String main() {

		return "/main";
	}

	@RequestMapping("/join_success")
	public String join_success(@ModelAttribute("dto") MemberDto memberDto) {

		return "/join_success";
	}

	@RequestMapping("form")
	public String form() {

		return "form";
	}

	@RequestMapping("formOk")
	public String formOk(@ModelAttribute("stu") StudentDto studentDto) {

		return "formOk";
	}
}
