package com.javalec.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JoinController {
	
	@RequestMapping(value = "/join")
	public String join(HttpServletRequest request, Model model) {
		
		String j_id = "spring";
		model.addAttribute("j_id",j_id);
		
		return "join";
	}
}
