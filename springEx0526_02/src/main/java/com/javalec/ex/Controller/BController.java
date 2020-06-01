package com.javalec.ex.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.command.BListCommand;
import com.javalec.ex.command.Command;
import com.javalec.ex.command.ContentViewCommand;
import com.javalec.ex.command.DeleteCommand;
import com.javalec.ex.command.WriteCommand;
import com.javalec.ex.constant.Constant;

@Controller
public class BController {

	public JdbcTemplate template;
	Command bcom = null;

	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}

	// 리스트 출력
	@RequestMapping("list")
	public String list(HttpServletRequest request, Model model) {

		bcom = new BListCommand();
		bcom.execute(model);

		return "list";
	}

	// 글쓰기 창
	@RequestMapping("write_view")
	public String write_view() {

		return "write_view";
	}

	// 글쓰기 완료
	@RequestMapping("write")
	public String write(HttpServletRequest request, Model model) {

		model.addAttribute("request", request);

		bcom = new WriteCommand();
		bcom.execute(model);

		return "redirect:list";
	}

	// 글목록 보기
	@RequestMapping("content_view")
	public String content_view(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);

		bcom = new ContentViewCommand();
		bcom.execute(model);
		return "content_view";
	}

	public String delete(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);

		bcom = new DeleteCommand();
		bcom.execute(model);

		return "redirect:list";
	}
}
