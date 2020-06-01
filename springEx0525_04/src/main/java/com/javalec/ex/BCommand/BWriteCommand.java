package com.javalec.ex.BCommand;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.ex.BDao.BDao;

public class BWriteCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// map 형식 key : value
		// model을 map형식처럼 사용하겠다라는 뜻
		Map<String, Object> map = model.asMap(); //
		HttpServletRequest request = (HttpServletRequest) map.get("request");

		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");

		BDao dao = new BDao();
		dao.write(bName, bTitle, bContent);

	}

}
