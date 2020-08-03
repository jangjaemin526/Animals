package com.jaemin.web.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jaemin.web.dao.NoticeDao;
import com.jaemin.web.entity.Notice;

@Controller("NoticeController") 
@RequestMapping("/notice/")
public class NoticeController {

	@Autowired
	private NoticeDao noticeDao;
	
	@GetMapping("list")
	public String List(@RequestParam(name = "p", defaultValue = "1") int page,
			@RequestParam(name = "q", defaultValue = "") String query,
			@RequestParam(name = "f", defaultValue = "title") String field, Model model)
			throws ClassNotFoundException, SQLException {
		
		page = (page-1)*10;
		List<Notice> list = noticeDao.getList(page, query, field);
		model.addAttribute("list", list);

		return "notice.list";
	}
	
	
   @GetMapping("detail")
   public String Detail(int id, Model model) throws ClassNotFoundException, SQLException {

      Notice notice = noticeDao.get(id);
      model.addAttribute("n",notice);
      return "notice.detail";
   }
	 
}