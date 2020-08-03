package com.jaemin.web.entity;

import java.util.Date;

public class Playground {
	
	private int id;
	private String playgroundname;
	private String address;
	private String opninghour;
	private String explanation;
	private String playgroundimg;
	private Date regdate;
	
	public Playground() {
		
	}

	public Playground(int id, String playgroundname, String address, String opninghour, String explanation,
			String playgroundimg, Date regdate) {
		this.id = id;
		this.playgroundname = playgroundname;
		this.address = address;
		this.opninghour = opninghour;
		this.explanation = explanation;
		this.playgroundimg = playgroundimg;
		this.regdate = regdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaygroundname() {
		return playgroundname;
	}

	public void setPlaygroundname(String playgroundname) {
		this.playgroundname = playgroundname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOpninghour() {
		return opninghour;
	}

	public void setOpninghour(String opninghour) {
		this.opninghour = opninghour;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public String getPlaygroundimg() {
		return playgroundimg;
	}

	public void setPlaygroundimg(String playgroundimg) {
		this.playgroundimg = playgroundimg;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Playground [id=" + id + ", playgroundname=" + playgroundname + ", address=" + address + ", opninghour="
				+ opninghour + ", explanation=" + explanation + ", playgroundimg=" + playgroundimg + ", regdate="
				+ regdate + "]";
	}
}
