package com.jaemin.web.entity;

import java.util.Date;

public class Job {

	private int id;
	private String name;
	private String title;
	private String content;
	private Date regdate;
	
	public Job() {
	
	}

	public Job(int id, String name, String title, String content, Date regdate) {
		this.id = id;
		this.name = name;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Job [id=" + id + ", name=" + name + ", title=" + title + ", content=" + content + ", regdate=" + regdate
				+ "]";
	}
}
