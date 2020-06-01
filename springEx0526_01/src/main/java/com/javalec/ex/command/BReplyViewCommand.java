package com.javalec.ex.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.ex.BDto.BDto;
import com.javalec.ex.Dao.BDao;

public class BReplyViewCommand implements BCommand {

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");

		String bId = request.getParameter("bId");

		BDao dao = new BDao();
		BDto dto = dao.reply_view(bId);
		model.addAttribute("reply_view", dto);

	}

}
