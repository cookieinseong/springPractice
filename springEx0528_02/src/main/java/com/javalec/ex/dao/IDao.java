package com.javalec.ex.dao;

import java.util.ArrayList;

import com.javalec.ex.dto.Bdto;

public interface IDao {

	public ArrayList<Bdto> list();

	public Bdto content_view(String bId);

	public void write(String bName, String bTitle, String bContent);

	public void upHit(String bId);

	public Bdto modify_view(String bId);

	public void modify(String bId, String bName, String bTitle, String bContent);

	public Bdto reply_view(String bId);

	public void reply(Bdto bdto);

	public void replyShape(int bGroup, int bStep);

}
