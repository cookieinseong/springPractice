package com.javalec.ex.BCommand;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.javalec.ex.BDao.BDao;
import com.javalec.ex.BDto.BDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(Model model) {

		ArrayList<BDto> dtos = new ArrayList<BDto>();
		BDao dao = new BDao();
		dtos = dao.list();
		System.out.println("test");

		model.addAttribute("list", dtos);
	}

}
