package com.javalec.ex.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.Dao.IDao;

@Controller
public class BController {

	@Autowired
	private SqlSession sqlSession;

//	BCommand bcom = null;
//
//	JdbcTemplate template;
//
//	@Autowired
//	public void setTemplate(JdbcTemplate template) {
//		this.template = template;
//		Constant.template = this.template;
//	}

	@RequestMapping("/list")
	public String list(Model model) {
		// mybatis에 있는 객체를 가져옴. mybatis에 있는 객체는 dao에 있는 객체 dao.list()
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.list();
		model.addAttribute("list", dao.list());
//		bcom = new BListCommand();
//		bcom.execute(model);
		return "list";
	}

//	@RequestMapping("write_view") // 작성자, 제목, 내용
//	public String write(HttpServletRequest request, Model model) {
//		model.addAttribute("request", request);
//		bcom = new BWriteCommand();
//		bcom.execute(model);
//		return "redirect:list";
//	}
//
//	@RequestMapping("write")
//	public String write_view(Model model) {
//
//		return "write_view"; // form화면
//	}
//
//	@RequestMapping("content_view") // list - >제목을 클릭
//	public String content_view(HttpServletRequest request, Model model) {
//		model.addAttribute("request", request);
//
//		bcom = new BContentCommand();
//		bcom.execute(model);
//		return "content_view";
//	}
//
//	// method=RequestMethod.POST / PostMapping("modfiy")
//	@RequestMapping("modify_view")
//	public String modify_view(HttpServletRequest request, Model model) {
//		model.addAttribute("request", request);
//		bcom = new BModifyViewCommand();
//		bcom.execute(model);
//
//		return "modify_view";
//	}
//
//	// method=RequestMethod.POST / PostMapping("modfiy")
//	@RequestMapping(method = RequestMethod.POST, value = "modify")
//	public String modify(HttpServletRequest request, Model model) {
//		model.addAttribute("request", request);
//		bcom = new BModifyCommand();
//		bcom.execute(model);
//
//		return "redirect:list";
//	}
//
//	@RequestMapping("reply_view")
//	public String reply_view(HttpServletRequest request, Model model) {
//		model.addAttribute("request", request);
//		bcom = new BReplyViewCommand();
//		bcom.execute(model);
//		return "reply_view";
//	}
//
//	@RequestMapping("reply")
//	public String reply(HttpServletRequest request, Model model) {
//		model.addAttribute("request", request);
//		bcom = new BReplyCommand();
//		bcom.execute(model);
//		return "redirect:list";
//	}
//
//	@RequestMapping("delete")
//	public String delete(HttpServletRequest request, Model model) {
//		model.addAttribute("request", request);
//		bcom = new BDeleteCommand();
//		bcom.execute(model);
//
//		return "redirect:list";
//
//	}

}
