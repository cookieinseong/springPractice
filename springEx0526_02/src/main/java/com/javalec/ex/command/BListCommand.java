package com.javalec.ex.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.javalec.ex.Dao.Dao;
import com.javalec.ex.Dto.Dto;

public class BListCommand implements Command {

	@Override
	public void execute(Model model) {

		Dao dao = new Dao();

		ArrayList<Dto> dtos = dao.list();

		model.addAttribute("list", dtos);

	}

}
