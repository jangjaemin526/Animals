package com.jaemin.web.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jaemin.web.dao.TaboofoodDao;
import com.jaemin.web.entity.Taboofood;

@Controller("TaboofoodController") 
@RequestMapping("/taboofood/")
public class TaboofoodController {

	@Autowired
	private TaboofoodDao taboofoodDao;
	
	@GetMapping("list")
	public String List(@RequestParam(name = "p", defaultValue = "1") int page,
			@RequestParam(name = "q", defaultValue = "") String query,
			@RequestParam(name = "f", defaultValue = "foodname") String field, Model model)
			throws ClassNotFoundException, SQLException {
		
		page = (page-1)*10;
		List<Taboofood> list = taboofoodDao.getList(page, query, field);
		model.addAttribute("list", list);

		return "taboofood.list";
	}
	
	
   @GetMapping("detail")
   public String Detail(int id, Model model) throws ClassNotFoundException, SQLException {

      Taboofood taboofood = taboofoodDao.get(id);
      model.addAttribute("t",taboofood);
      return "taboofood.detail";
   }
	 
}