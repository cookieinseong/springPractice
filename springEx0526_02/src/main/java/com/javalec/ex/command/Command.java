package com.javalec.ex.command;

import org.springframework.ui.Model;

public interface Command {

	public abstract void execute(Model model);

}
