package com.jaemin.web.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jaemin.web.dao.HamsterrecommendDao;
import com.jaemin.web.entity.Hamsterrecommend;

@Controller("HamsterrecommendController")
@RequestMapping("/hamsterrecommend/")
public class HamsterrecommendController {

	@Autowired
	private HamsterrecommendDao hamsterrecommendDao;
	
	@GetMapping("list")
	public String List(
			@RequestParam(name = "p", defaultValue = "1") int page,
			@RequestParam(name = "q", defaultValue = "") String query,
			@RequestParam(name = "f", defaultValue = "hamsterbreed") String field, Model model)
			throws ClassNotFoundException, SQLException {

		page = (page-1) * 10;
		List<Hamsterrecommend> list = hamsterrecommendDao.getList(page, query, field);
		model.addAttribute("list", list);

		return "hamsterrecommend.list";
	}
	
	@GetMapping("detail")
	public String Detail(int id, Model model) throws ClassNotFoundException, SQLException{
		
		Hamsterrecommend hamsterrecommend = hamsterrecommendDao.get(id);
		model.addAttribute("hs", hamsterrecommend);
		return "hamsterrecommend.detail";
		
	}
}
