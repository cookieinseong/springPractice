package com.javalec.ex.model.dao;

import java.util.List;

import com.javalec.ex.model.dto.BDto;

public interface BDao {

	public List<BDto> list();

	public BDto content_view(int bId);

	public void delete(int bId);

	public void write(BDto bDto);

	public BDto modify_view(int bId);
}
