package com.javalec.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.command.BCommand;
import com.javalec.ex.command.BListCommand;
import com.javalec.ex.dao.IDao;
import com.javalec.ex.dto.BDto;

@Controller
public class BController {

	@Autowired
	private SqlSession sqlSession;

	BCommand comm;

	@RequestMapping("list")
	public String list(Model model) {

		comm = new BListCommand();
		comm.execute(sqlSession, model);
//		IDao dao = sqlSession.getMapper(IDao.class);
//		model.addAttribute("list", dao.list());
		return "list";
	}

	@RequestMapping("write_view")
	public String write_view(Model model) {

		return "write_view";
	}

	@RequestMapping("write")
	public String write(BDto bdto, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.write(bdto.getbName(), bdto.getbTitle(), bdto.getbContent());
		return "redirect:list";
	}

	@RequestMapping("content_view")
	public String content_view(HttpServletRequest request, Model model) {

		IDao dao = sqlSession.getMapper(IDao.class);
		dao.upHit(request.getParameter("bId"));

		model.addAttribute("content_view", dao.contentView(request.getParameter("bId")));
		return "content_view";
	}

	@RequestMapping("modify_view")
	public String modify_view(HttpServletRequest request, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);

		model.addAttribute("modify_view", dao.modifyView(request.getParameter("bId")));
		return "modify_view";
	}

	@RequestMapping("modify")
	public String modify(BDto bdto, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.modify(Integer.toString(bdto.getbId()), bdto.getbName(), bdto.getbTitle(), bdto.getbContent());
		return "redirect:list";
	}

	@RequestMapping("delete")
	public String delete(HttpServletRequest request, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.delete(request.getParameter("bId"));
		return "redirect:list";
	}

	@RequestMapping("reply_view")
	public String reply_view(HttpServletRequest request, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("reply_view", dao.reply_view(request.getParameter("bId")));

		return "reply_view";
	}

	@RequestMapping("reply")
	public String reply(BDto bdto, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.replyShape(bdto.getbGroup(), bdto.getbStep());

		System.out.println(bdto.getbName());
		dao.reply(bdto);
		return "redirect:list";
	}

}
