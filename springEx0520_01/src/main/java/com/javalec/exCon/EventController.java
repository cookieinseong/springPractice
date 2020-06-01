package com.javalec.exCon;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventController {

	@RequestMapping("/main")
	public String main() {

		return "main";
	}

	@RequestMapping("/contentView")
	public String contentView() {

		return "contentView";
	}

	@RequestMapping("event/view")
	public String view(Model model) {

		model.addAttribute("id", "naver_admin");
		model.addAttribute("pw", "1234");

		return "event/view";
	}

	@RequestMapping("event/modelAndView")
	public ModelAndView modelAndView() {

		ModelAndView mv = new ModelAndView();
		mv.addObject("id", "naver_admin");
		mv.addObject("pw", 1234);
		mv.setViewName("event/modelAndView");

		return mv;

	}

}
