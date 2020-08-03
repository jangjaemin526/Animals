package com.jaemin.web.entity;

import java.util.Date;

public class Notice {

	private int id;
	private String uid;
	private String title;
	private String content;
	private Date regdate;
	private int hit;
	
	public Notice() {
	
	}

	public Notice(int id, String uid, String title, String content, Date regdate, int hit) {
		this.id = id;
		this.uid = uid;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
		this.hit = hit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
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

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	@Override
	public String toString() {
		return "Notice [id=" + id + ", uid=" + uid + ", title=" + title + ", content=" + content + ", regdate="
				+ regdate + ", hit=" + hit + "]";
	}
}
