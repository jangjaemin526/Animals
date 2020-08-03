package com.jaemin.web.entity;

import java.util.Date;

public class Behaviorintention {
	
	private int id;
	private String behavior;
	private String intention;
	private Date regdate;
	
	public Behaviorintention() {
		
	}

	public Behaviorintention(int id, String behavior, String intention, Date regdate) {
		this.id = id;
		this.behavior = behavior;
		this.intention = intention;
		this.regdate = regdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBehavior() {
		return behavior;
	}

	public void setBehavior(String behavior) {
		this.behavior = behavior;
	}

	public String getIntention() {
		return intention;
	}

	public void setIntention(String intention) {
		this.intention = intention;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Behaviorintention [id=" + id + ", behavior=" + behavior + ", intention=" + intention + ", regdate="
				+ regdate + "]";
	}
}
