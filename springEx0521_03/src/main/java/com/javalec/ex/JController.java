package com.javalec.ex;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JController {

	@RequestMapping("/form")
	public String form() {

		return "/form";
	}

	@RequestMapping("/formOk")
	public String formOk(@Valid JoinMember joinMember, BindingResult result) {

		Validator validate = new Validator();
		String page = "/formOk";

		if (result.hasErrors()) {
			return "/form";
		}

		return page;
	}

	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new Validator());
	}
}
