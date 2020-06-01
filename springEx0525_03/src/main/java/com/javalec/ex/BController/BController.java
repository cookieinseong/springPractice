package com.javalec.ex.BController;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.BCommand.BCommand;
import com.javalec.ex.BCommand.BContentCommand;
import com.javalec.ex.BCommand.BListCommand;
import com.javalec.ex.util.Constant;

@Controller
public class BController {

	JdbcTemplate template;
	BCommand bcom = null;

	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = template;
	}

	@RequestMapping("/list")
	public String list(Model model) {
		bcom = new BListCommand();
		bcom.execute(model);
		System.out.println("test");
		return "/list";

	}

	@RequestMapping("/content_view")
	public String content_view(HttpServletRequest request, Model model) {

		model.addAttribute("request", request);

		bcom = new BContentCommand();
		bcom.execute(model);

		return "/content_view";
	}

}
