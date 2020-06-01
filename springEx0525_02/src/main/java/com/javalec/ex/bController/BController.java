package com.javalec.ex.bController;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;

import com.javalec.ex.util.Constant;

@Controller
public class BController {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}

}
