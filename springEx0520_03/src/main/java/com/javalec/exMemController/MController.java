package com.javalec.exMemController;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MController {

	@RequestMapping("member/join")
	public String join() {

		return "member/join";
	}

	@RequestMapping(method = RequestMethod.POST, value = "member/joinOk")
	public ModelAndView modelAndView(HttpServletRequest request) {

		ModelAndView mv = new ModelAndView();

		String mem_num = request.getParameter("mem_num");
		String mem_name = request.getParameter("mem_name");
		String mem_address = request.getParameter("mem_address");
		String mem_tell = request.getParameter("mem_tell");
		String mem_birth = request.getParameter("mem_birth");

		mv.addObject("mem_num", mem_num);
		mv.addObject("mem_name", mem_name);
		mv.addObject("mem_address", mem_address);
		mv.addObject("mem_tell", mem_tell);
		mv.addObject("mem_birth", mem_birth);
		mv.setViewName("member/joinOk");
		return mv;
	}

	@RequestMapping(method = RequestMethod.GET, value = "member/joinOk")
	public String modelAndView(HttpServletRequest request, Model model) {

		String mem_num = request.getParameter("mem_num");
		String mem_name = request.getParameter("mem_name");
		String mem_address = request.getParameter("mem_address");
		String mem_tell = request.getParameter("mem_tell");
		String mem_birth = request.getParameter("mem_birth");

		model.addAttribute("mem_num", mem_num);
		model.addAttribute("mem_name", mem_name);
		model.addAttribute("mem_address", mem_address);
		model.addAttribute("mem_tell", mem_tell);
		model.addAttribute("mem_birth", mem_birth);

		return "member/joinOk";
	}
}
