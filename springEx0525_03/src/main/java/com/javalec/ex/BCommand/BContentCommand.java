package com.javalec.ex.BCommand;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.ex.BDao.BDao;
import com.javalec.ex.BDto.BDto;

public class BContentCommand implements BCommand {

	public void execute(Model model) {

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String bId = request.getParameter("bId");
		BDto bdto = new BDto();
		BDao bdao = new BDao();
		bdto = bdao.contentView(bId);
		model.addAttribute("content_view", bdto);

	}
}
