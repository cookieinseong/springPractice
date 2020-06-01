package com.javalec.stuCon;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@RequestMapping("student/studentView")
	public String studentView(Model model) {
		
		model.addAttribute("stu_num",1234);
		model.addAttribute("stu_name","홍길동");
		model.addAttribute("stu_major","영어영문");
		model.addAttribute("stu_address","서울");
		model.addAttribute("stu_tel","010-1111-1111");
		
		
		return"student/studentView";
	}
}
