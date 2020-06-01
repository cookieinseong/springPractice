package com.javalec.ex.command;

import org.springframework.ui.Model;

public interface BCommand {

	public abstract void execute(Model model);
}
