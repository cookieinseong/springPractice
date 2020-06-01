package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PController {

	@RequestMapping
	public String productView() {

		return "";
	}
}
