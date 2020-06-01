package com.javalec.exStuDto;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StuController {

	@RequestMapping("/form")
	public String form() {

		return "form";
	}

	@PostMapping
	public String formOk(StuDto stuDto, BindingResult result) {

		String page = "/formOk";

		StuValidator validator = new StuValidator();
		validator.validate(stuDto, result);

		if (result.hasErrors()) {
			page = "form";
		}

		return page;
	}
}
