package com.jaemin.web.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jaemin.web.dao.BehaviorintentionDao;
import com.jaemin.web.entity.Behaviorintention;

@Controller("BehaviorintentionController") 
@RequestMapping("/behaviorintention/")
public class BehaviorintentionController {

	@Autowired
	private BehaviorintentionDao behaviorintentionDao;
	
	@GetMapping("list")
	public String List(@RequestParam(name = "p", defaultValue = "1") int page,
			@RequestParam(name = "q", defaultValue = "") String query,
			@RequestParam(name = "f", defaultValue = "behavior") String field, Model model)
			throws ClassNotFoundException, SQLException {
		
		page = (page-1)*10;
		List<Behaviorintention> list = behaviorintentionDao.getList(page, query, field);
		model.addAttribute("list", list);

		return "behaviorintention.list";
	}
	
	
   @GetMapping("detail")
   public String Detail(int id, Model model) throws ClassNotFoundException, SQLException {

	  Behaviorintention behaviorintention = behaviorintentionDao.get(id);
      model.addAttribute("b",behaviorintention);
      return "behaviorintention.detail";
   }
	 
}