package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EController {
	
	@RequestMapping(value = "event")
	public String event() {
		return "event";
	}
	
	@RequestMapping(value = "eventList")
	public String eventList() {
		return "eventList";
	}
	
	@RequestMapping(value = "puppy")
	public String puppy() {
		return "puppy";
	}
}
