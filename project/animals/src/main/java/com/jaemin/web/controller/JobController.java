package com.jaemin.web.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jaemin.web.dao.JobDao;
import com.jaemin.web.entity.Job;

@Controller("JobController") 
@RequestMapping("/jobintroduction/")
public class JobController {

	@Autowired
	private JobDao jobDao;
	
	@GetMapping("list")
	public String List(@RequestParam(name = "p", defaultValue = "1") int page,
			@RequestParam(name = "q", defaultValue = "") String query,
			@RequestParam(name = "f", defaultValue = "title") String field, Model model)
			throws ClassNotFoundException, SQLException {
		
		List<Job> list = jobDao.getList(page, query, field);
		model.addAttribute("list", list);

		return "jobintroduction.list";
	}
	
	
	
   @GetMapping("detail")
   public String Detail(int id, Model model) throws ClassNotFoundException, SQLException {

      Job job = jobDao.get(id);
      model.addAttribute("j",job);
      return "jobintroduction.detail";
   }
	 

}