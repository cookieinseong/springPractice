package com.javalec.ex.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.ex.Dao.Dao;
import com.javalec.ex.Dto.Dto;

public class ContentViewCommand implements Command {

	@Override
	public void execute(Model model) {

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");

		String bId = request.getParameter("bId");

		Dao dao = new Dao();
		Dto dto = dao.content_view(bId);

		model.addAttribute("content_view", dto);

	}

}
