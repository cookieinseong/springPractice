package com.javalec.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LController {

	@RequestMapping("form")
	public String form() {

		return "form";
	}

	@RequestMapping("/checkOk")
	public String checkOk(HttpServletRequest request, Model model) {
		String pw = request.getParameter("pw");
		String id = request.getParameter("id");
		if (id.equals("naver_admin")) {
			model.addAttribute("id", id);
			model.addAttribute("pw", pw);
			return "loginOk";
		} else {
			return "loginFail";
		}

	}

	@RequestMapping("loginOk")
	public String loginOk() {

		return "loginOk";
	}

	@RequestMapping("loginFail")
	public String loginFail() {

		return "loginFail";
	}

	@RequestMapping("formOk")
	public String form(@ModelAttribute("stu") Student student) {

		return "formOk";
	}
}
