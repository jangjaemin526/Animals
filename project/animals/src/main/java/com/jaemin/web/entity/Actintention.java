package com.jaemin.web.entity;

import java.util.Date;

public class Actintention {

	private int id;
	private String act;
	private String intention;
	private String actimg;
	private Date regdate;
	
	public Actintention() {

	}

	public Actintention(int id, String act, String intention, String actimg, Date regdate) {
		this.id = id;
		this.act = act;
		this.intention = intention;
		this.actimg = actimg;
		this.regdate = regdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAct() {
		return act;
	}

	public void setAct(String act) {
		this.act = act;
	}

	public String getIntention() {
		return intention;
	}

	public void setIntention(String intention) {
		this.intention = intention;
	}

	public String getActimg() {
		return actimg;
	}

	public void setActimg(String actimg) {
		this.actimg = actimg;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Actintention [id=" + id + ", act=" + act + ", intention=" + intention + ", actimg=" + actimg
				+ ", regdate=" + regdate + "]";
	}
}
