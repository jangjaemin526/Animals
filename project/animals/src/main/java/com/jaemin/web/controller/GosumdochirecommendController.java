package com.jaemin.web.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jaemin.web.dao.GosumdochirecommendDao;
import com.jaemin.web.entity.Gosumdochirecommend;

@Controller("GosumdochirecommendController")
@RequestMapping("/gosumdochirecommend/")
public class GosumdochirecommendController {

	@Autowired
	private GosumdochirecommendDao gosumdochirecommendDao;
	
	@GetMapping("list")
	public String List(
			@RequestParam(name = "p", defaultValue = "1") int page,
			@RequestParam(name = "q", defaultValue = "") String query,
			@RequestParam(name = "f", defaultValue = "gosumdochibreed") String field, Model model)
			throws ClassNotFoundException, SQLException {

		page = (page-1) * 10;
		List<Gosumdochirecommend> list = gosumdochirecommendDao.getList(page, query, field);
		model.addAttribute("list", list);

		return "gosumdochirecommend.list";
	}
	
	@GetMapping("detail")
	public String Detail(int id, Model model) throws ClassNotFoundException, SQLException{
		
		Gosumdochirecommend gosumdochrecommend = gosumdochirecommendDao.get(id);
		model.addAttribute("g", gosumdochrecommend);
		return "gosumdochirecommend.detail";
		
	}
}
