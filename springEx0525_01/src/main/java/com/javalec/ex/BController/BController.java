package com.javalec.ex.BController;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.BCommand.BCommand;
import com.javalec.ex.BCommand.BContentCommand;
import com.javalec.ex.BCommand.BDeleteCommand;
import com.javalec.ex.BCommand.BListCommand;
import com.javalec.ex.BCommand.BReplyCommand;
import com.javalec.ex.BCommand.BReplyViewCommand;
import com.javalec.ex.BCommand.BWriteCommand;
import com.javalec.util.Constant;

@Controller
public class BController {

	BCommand bcom = null;

	// jdbc 연결
	public JdbcTemplate template;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}

	@RequestMapping("reply_view")
	public String reply_view(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		bcom = new BReplyViewCommand();
		bcom.execute(model);
		return "reply_view";
	}

	@RequestMapping("reply")
	public String reply(HttpServletRequest request, Model model) {

		model.addAttribute("request", request);
		bcom = new BReplyCommand();
		return "redirect:list";
	}

	@RequestMapping("delete")
	public String delete(HttpServletRequest request, Model model) {

		model.addAttribute("request", request);

		bcom = new BDeleteCommand();

		bcom.execute(model);

		return "redirect:list";

	}

	@RequestMapping("write")
	public String write(Model model) {
		return "/write_view";
	}

	@RequestMapping("write_view")
	public String write_view(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);

		bcom = new BWriteCommand();

		bcom.execute(model);

		return "redirect:list";
	}

	// 링크 연결
	@RequestMapping("/list")
	public String list(Model model) {
		bcom = new BListCommand();
		bcom.execute(model);

		return "list";
	}

	@RequestMapping("/content_view")
	public String content_view(HttpServletRequest request, Model model) {

		model.addAttribute("request", request);

		bcom = new BContentCommand();
		bcom.execute(model);

		return "/content_view";
	}
}
