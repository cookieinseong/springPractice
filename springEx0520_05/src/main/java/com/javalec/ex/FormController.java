package com.javalec.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

	@RequestMapping("form")
	public String form() {

		return "form";
	}

	@RequestMapping("formOk1")
	public String formOk1(HttpServletRequest request, Model model) {

		String num = request.getParameter("num");
		String headline = request.getParameter("headline");
		String content = request.getParameter("content");
		String date = request.getParameter("date");
		String group = request.getParameter("group");
		String step = request.getParameter("step");
		String indent = request.getParameter("indent");

		model.addAttribute("num", num);
		model.addAttribute("headline", headline);
		model.addAttribute("content", content);
		model.addAttribute("date", date);
		model.addAttribute("group", group);
		model.addAttribute("step", step);
		model.addAttribute("indent", indent);

		return "formOk1";
	}

	@RequestMapping("form2")
	public String form2() {
		return "form2";
	}

	@RequestMapping("formOk2")
	public String formOk2(@RequestParam("num") int num, @RequestParam("headline") String headline,
			@RequestParam("num") String content, @RequestParam("date") String date, @RequestParam("group") String group,
			@RequestParam("step") String step, @RequestParam("indent") String indent, Model model) {

		model.addAttribute("num", num);
		model.addAttribute("headline", headline);
		model.addAttribute("content", content);
		model.addAttribute("date", date);
		model.addAttribute("group", group);
		model.addAttribute("step", step);
		model.addAttribute("indent", indent);

		return "formOk2";
	}

	@RequestMapping("/form3")
	public String form3() {
		return "/form3";
	}

	@RequestMapping("/formOk3")
	public String formOk3(FormDto formDto) {
		return "/formOk3";
	}
}
