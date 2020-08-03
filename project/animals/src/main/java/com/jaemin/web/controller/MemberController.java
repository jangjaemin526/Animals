package com.jaemin.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jaemin.web.dao.MemberDao;
import com.jaemin.web.entity.Member;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberDao memberDao;
	
	@GetMapping("join")
	public String join() {
		
		return "member.join";
	}
	
	@PostMapping("join")
	public String join(Member member) {
		
		memberDao.insert(member);
		
		return "redirect:/index";
	}
	
	@GetMapping("login")
	public String login() {
		
		return "member.login";
	}
	
	@PostMapping("login")
	public String login(Member member,HttpSession session) {
		
		String uid = member.getUid();
		session.setAttribute("uid", uid);
		
		return "redirect:/index";
	}
	
	@GetMapping("logout")
	public String logout(Member member,HttpSession session) {
		
		session.invalidate();
	
		return "redirect:/index";
	}
}
