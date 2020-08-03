package com.jaemin.web.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jaemin.web.dao.HospitalDao;
import com.jaemin.web.entity.Hospital;

@Controller("HospitalController")
@RequestMapping("/hospital/")
public class HospitalController {
	
	@Autowired
	private HospitalDao hospitalDao;
	
	@GetMapping("list")
	public String List(
			@RequestParam(name = "p", defaultValue = "1") int page,
			@RequestParam(name = "q", defaultValue = "") String query,
			@RequestParam(name = "f", defaultValue = "name") String field, Model model)
			throws ClassNotFoundException, SQLException {
		
		page = (page-1)*10;
		List<Hospital> list = hospitalDao.getList(page, query, field);
		model.addAttribute("list", list);
       
		return "hospital.list";
	}
	
	
   @GetMapping("detail")
   public String Detail(int id, Model model) throws ClassNotFoundException, SQLException {

	  Hospital hospital = hospitalDao.get(id);
      model.addAttribute("h",hospital);
      return "hospital.detail";
   }
}

