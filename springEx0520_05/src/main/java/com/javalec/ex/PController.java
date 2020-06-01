package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PController {
	// 변수로 인식해라 뜻 http://localhost:8181/ex/student/~ 아무거나다 변수로 받아주겠다
	@RequestMapping("student/{studentId}")
	public String pathViewOk(@PathVariable String studentId, Model model) {

		model.addAttribute("studentId", studentId);

		return "student/pathViewOk";
	}
}
