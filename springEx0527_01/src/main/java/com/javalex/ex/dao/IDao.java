package com.javalex.ex.dao;

import java.util.ArrayList;

import com.javalec.ex.dto.Dto;

public interface IDao {
	// BDao에 있는 메소드 선언부들
	public ArrayList<Dto> list();

	public void write(String bName, String bTitle, String bContent);

	public Dto contentView(String bId);

	public Dto modifyView(String bId);

	public void modify(String bId, String bName, String bTitle, String bContent);

	public void delete(final String bId);

	public Dto reply_view(String bId);

	public void reply(String bId, String bName, String bTitle, String bContent, String bGroup, String bStep,
			String bIndent);

	public void replyShape(String bGroup, String bStep);

	public void upHit(String bId);
}
