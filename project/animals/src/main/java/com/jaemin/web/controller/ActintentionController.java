package com.jaemin.web.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jaemin.web.dao.ActintentionDao;
import com.jaemin.web.entity.Actintention;

@Controller("ActintentionController") 
@RequestMapping("/actintention/")
public class ActintentionController {

	@Autowired
	private ActintentionDao actintentionDao;
	
	@GetMapping("list")
	public String List(@RequestParam(name = "p", defaultValue = "1") int page,
			@RequestParam(name = "q", defaultValue = "") String query,
			@RequestParam(name = "f", defaultValue = "act") String field, Model model)
			throws ClassNotFoundException, SQLException {
		
		page = (page-1)*10;
		List<Actintention> list = actintentionDao.getList(page, query, field);
		model.addAttribute("list", list);

		return "actintention.list";
	}
	
	
   @GetMapping("detail")
   public String Detail(int id, Model model) throws ClassNotFoundException, SQLException {

	  Actintention actintention = actintentionDao.get(id);
      model.addAttribute("a",actintention);
      return "actintention.detail";
   }
	 
}