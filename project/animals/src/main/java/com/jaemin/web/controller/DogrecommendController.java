package com.jaemin.web.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jaemin.web.dao.DogrecommendDao;
import com.jaemin.web.entity.Dogrecommend;

@Controller("DogrecommendController")
@RequestMapping("/dogrecommend/")
public class DogrecommendController {

	@Autowired
	private DogrecommendDao dogrecommendDao;
	
	@GetMapping("list")
	public String List(
			@RequestParam(name = "p", defaultValue = "1") int page,
			@RequestParam(name = "q", defaultValue = "") String query,
			@RequestParam(name = "f", defaultValue = "dogbreed") String field, Model model)
			throws ClassNotFoundException, SQLException {

		page = (page-1) * 10;
		List<Dogrecommend> list = dogrecommendDao.getList(page, query, field);
		model.addAttribute("list", list);

		return "dogrecommend.list";
	}
	
	@GetMapping("detail")
	public String Detail(int id, Model model) throws ClassNotFoundException, SQLException{
		
		Dogrecommend dogrecommend = dogrecommendDao.get(id);
		model.addAttribute("d", dogrecommend);
		return "dogrecommend.detail";
		
	}
}
