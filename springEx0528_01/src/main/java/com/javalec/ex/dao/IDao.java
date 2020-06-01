package com.javalec.ex.dao;

import java.util.ArrayList;

import com.javalec.ex.dto.BDto;

public interface IDao {

	// BDao에 있는 메소드 선언부들
	public ArrayList<BDto> list();

	public void write(String bName, String bTitle, String bContent);

	public BDto contentView(String bId);

	public BDto modifyView(String bId);

	public void modify(String bId, String bName, String bTitle, String bContent);

	public void delete(final String bId);

	public BDto reply_view(String bId);

	public void reply(BDto bdto);

	public void replyShape(int bGroup, int bStep);

	public void upHit(String bId);
}
