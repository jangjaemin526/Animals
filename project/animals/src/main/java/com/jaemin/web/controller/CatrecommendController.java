package com.jaemin.web.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jaemin.web.dao.CatrecommendDao;
import com.jaemin.web.entity.Catrecommend;

@Controller("CatrecommendController")
@RequestMapping("/catrecommend/")
public class CatrecommendController {

	@Autowired
	private CatrecommendDao catrecommendDao;
	
	@GetMapping("list")
	public String List(
			@RequestParam(name = "p", defaultValue = "1") int page,
			@RequestParam(name = "q", defaultValue = "") String query,
			@RequestParam(name = "f", defaultValue = "catbreed") String field, Model model)
			throws ClassNotFoundException, SQLException {

		page = (page-1) * 10;
		List<Catrecommend> list = catrecommendDao.getList(page, query, field);
		model.addAttribute("list", list);

		return "catrecommend.list";
	}
	
	@GetMapping("detail")
	public String Detail(int id, Model model) throws ClassNotFoundException, SQLException{
		
		Catrecommend catrecommend = catrecommendDao.get(id);
		model.addAttribute("c", catrecommend);
		return "catrecommend.detail";
		
	}
}
