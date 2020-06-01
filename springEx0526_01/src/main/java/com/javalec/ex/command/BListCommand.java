package com.javalec.ex.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.javalec.ex.BDto.BDto;
import com.javalec.ex.Dao.BDao;

public class BListCommand implements BCommand {

	@Override
	public void execute(Model model) {

		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();

		model.addAttribute("list", dtos);
	}

}
