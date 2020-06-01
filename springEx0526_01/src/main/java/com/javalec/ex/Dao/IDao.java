package com.javalec.ex.Dao;

import java.util.ArrayList;

import com.javalec.ex.BDto.BDto;

public interface IDao {
	
	// BDao에 있는 메소드 선언부들
	public ArrayList<BDto> list();

	public void write(String bName, String bTitle, String bContent);

	public BDto contentView(String bId);

	public BDto modifyView(String bId);

	public void modify(String bId, String bName, String bTitle, String bContent);

	public void delete(final String bId);

	public BDto reply_view(String bId);

	public void reply(String bId, String bName, String bTitle, String bContent, String bGroup, String bStep,
			String bIndent);

	public void replyShape(String bGroup, String bStep);

	public void upHit(String bId);
}
