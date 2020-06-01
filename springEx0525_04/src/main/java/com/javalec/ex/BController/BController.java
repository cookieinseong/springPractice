package com.javalec.ex.BController;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.BCommand.BCommand;
import com.javalec.ex.BCommand.BContentViewCommand;
import com.javalec.ex.BCommand.BDeleteCommand;
import com.javalec.ex.BCommand.BListCommand;
import com.javalec.ex.BCommand.BWriteCommand;
import com.javalec.ex.util.Constant;

@Controller
public class BController {

	BCommand bcom = null;

	public JdbcTemplate template;

	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}

	@RequestMapping("/list")
	public String list(Model model) {
		bcom = new BListCommand();
		bcom.execute(model);

		return "list";
	}

	@RequestMapping("/write")
	public String write() {

		return "write_view";
	}

	@RequestMapping("/write_view")
	public String write_view(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);

		bcom = new BWriteCommand();
		bcom.execute(model);

		return "redirect:list";
	}

	@RequestMapping("/content_view")
	public String content_view(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);

		bcom = new BContentViewCommand();
		bcom.execute(model);
		return "/content_view";
	}

	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {

		model.addAttribute("request", request);

		bcom = new BDeleteCommand();
		bcom.execute(model);

		return "redirect:list";
	}

}
