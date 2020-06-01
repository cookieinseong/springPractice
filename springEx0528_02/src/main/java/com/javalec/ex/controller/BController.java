package com.javalec.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.dao.IDao;
import com.javalec.ex.dto.Bdto;

@Controller
public class BController {

	@Autowired
	private SqlSession sqlSession;

	@RequestMapping("list")
	public String list(Model model) {

		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("list", dao.list());
		return "list";
	}

	@RequestMapping("write_view")
	public String write_view() {

		return "write_view";
	}

	@RequestMapping("write")
	public String write(Bdto bdto, Model model) {

		IDao dao = sqlSession.getMapper(IDao.class);
		System.out.println(bdto.getbName());
		dao.write(bdto.getbName(), bdto.getbTitle(), bdto.getbContent());

		return "redirect:list";
	}

	@RequestMapping("content_view")
	public String content_view(Bdto bdto, Model model) {

		IDao dao = sqlSession.getMapper(IDao.class);
		dao.upHit(Integer.toString(bdto.getbId()));
		model.addAttribute("content_view", dao.content_view(Integer.toString(bdto.getbId())));
		return "content_view";
	}

	@RequestMapping("modify_view")
	public String modify_view(HttpServletRequest request, Model model) {

		IDao dao = sqlSession.getMapper(IDao.class);

		model.addAttribute("modify_view", dao.modify_view(request.getParameter("bId")));

		return "modify_view";

	}

	@RequestMapping("modify")
	public String modify(Bdto bdto, Model model) {

		IDao dao = sqlSession.getMapper(IDao.class);

		dao.modify(Integer.toString(bdto.getbId()), bdto.getbName(), bdto.getbTitle(), bdto.getbContent());

		return "redirect:list";
	}

	@RequestMapping("reply_view")
	public String reply_view(HttpServletRequest request, Model model) {

		IDao dao = sqlSession.getMapper(IDao.class);

		model.addAttribute("reply_view", dao.reply_view(request.getParameter("bId")));

		return "reply_view";
	}

	@RequestMapping("reply")
	public String reply(Bdto bdto, Model model) {

		IDao dao = sqlSession.getMapper(IDao.class);

		dao.replyShape(bdto.getbGroup(), bdto.getbStep());

		dao.reply(bdto);

		return "redirect:list";
	}

}
