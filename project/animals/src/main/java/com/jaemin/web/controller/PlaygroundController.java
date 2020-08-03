package com.jaemin.web.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jaemin.web.dao.PlaygroundDao;
import com.jaemin.web.entity.Playground;

@Controller("PlaygroundController")
@RequestMapping("/playground/")
public class PlaygroundController {
	
	@Autowired
	private PlaygroundDao playgroundDao;
	
	@GetMapping("list")
	public String List(
			@RequestParam(name = "p", defaultValue = "1") int page,
			@RequestParam(name = "q", defaultValue = "") String query,
			@RequestParam(name = "f", defaultValue = "playgroundname") String field, Model model)
			throws ClassNotFoundException, SQLException {
		
		page = (page-1)*10;
		List<Playground> list = playgroundDao.getList(page, query, field);
		model.addAttribute("list", list);
       
		return "playground.list";
	}
	
	
   @GetMapping("detail")
   public String Detail(int id, Model model) throws ClassNotFoundException, SQLException {

	  Playground playground = playgroundDao.get(id);
      model.addAttribute("p",playground);
      return "playground.detail";
   }
}

