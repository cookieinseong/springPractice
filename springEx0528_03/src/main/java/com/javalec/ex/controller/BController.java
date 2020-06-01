package com.javalec.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.model.dto.BDto;
import com.javalec.ex.model.service.BService;

@Controller
public class BController {

	@Autowired
	private BService bService;

	@RequestMapping("list")
	public String list(Model model) {

		model.addAttribute("list", bService.list());
		return "list";
	}

	@RequestMapping("content_view")
	public String content_view(int bId, Model model) {
		model.addAttribute("content_view", bService.content_view(bId));
		return "content_view";
	}

	@RequestMapping("delete")
	public String delete(int bId) {
		bService.delete(bId);

		return "redirect:list";
	}

	@RequestMapping("write_view")
	public String write_view() {

		return "write_view";
	}

	@RequestMapping("write")
	public String write(BDto bDto) {

		bService.write(bDto);
		return "redirect:list";
	}

	@RequestMapping("modify_view")
	public String modify_view(int bId, Model model) {

		model.addAttribute("modify_view", bService.modify_view(bId));
		return "modify_view";

	}

}
