package com.javalec.ex.model.service;

import java.util.List;

import com.javalec.ex.model.dto.BDto;

public interface BService {
	// client > controller > service > dao > mapper > db > mapper > dao > service >
	// controller > view
	public List<BDto> list();

	public BDto content_view(int bId);

	public void delete(int bId);

	public void write(BDto bDto);

	public BDto modify_view(int bId);
}
