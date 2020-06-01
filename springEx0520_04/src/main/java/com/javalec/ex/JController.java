package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JController {
	@RequestMapping("join/main")
	public String main() {

		return "join/main";
	}

	@RequestMapping("join/login")
	public String login() {

		return "join/login";
	}

//	@RequestMapping("join/loginOk")
//	public String loginOk(HttpServletRequest request,Model model) {
//
//		String memberId = request.getParameter("memberId");
//		String memberPsw = request.getParameter("memberPsw");
//
//		model.addAttribute("memberId", memberId);
//		model.addAttribute("memberPsw", memberPsw);
//
//		return "join/loginOk";
//	}

	@RequestMapping("join/loginOk")
	public String loginOk(@RequestParam("memberId") String id, @RequestParam("memberPsw") String pw, Model model) {

		model.addAttribute("id", id);
		model.addAttribute("pw", pw);

		return "join/loginOk";
	}

	@RequestMapping("join/join")
	public String join() {

		return "join/join";
	}

//	@RequestMapping("join/joinOk")
//	public String joinOk(@RequestParam("stu_num") int stu_num, @RequestParam("stu_name") String stu_name,
//			@RequestParam("kor") int kor, @RequestParam("eng") int eng, @RequestParam("math") int math,
//			@RequestParam("total") int total, @RequestParam("avg") double avg, Model model) {
//
//		model.addAttribute("stu_num", stu_num);
//		model.addAttribute("stu_name", stu_name);
//		model.addAttribute("kor", kor);
//		model.addAttribute("eng", eng);
//		model.addAttribute("math", math);
//		model.addAttribute("total", total);
//		model.addAttribute("avg", avg);
//		return "join/joinOk";
//	}

	@RequestMapping("join/joinOk")
	public String joinOk(Student student) {

		return "join/joinOk";
	}

}
