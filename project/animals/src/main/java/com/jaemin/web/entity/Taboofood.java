package com.jaemin.web.entity;

import java.util.Date;

public class Taboofood {

	private int id;
	private String foodname;
	private String taboofoodimg;
	private String symptom;
	private Date regdate;
	
	public Taboofood() {
		
	}

	public Taboofood(int id, String foodname, String taboofoodimg, String symptom, Date regdate) {
		this.id = id;
		this.foodname = foodname;
		this.taboofoodimg = taboofoodimg;
		this.symptom = symptom;
		this.regdate = regdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public String getTaboofoodimg() {
		return taboofoodimg;
	}

	public void setTaboofoodimg(String taboofoodimg) {
		this.taboofoodimg = taboofoodimg;
	}

	public String getSymptom() {
		return symptom;
	}

	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Taboofood [id=" + id + ", foodname=" + foodname + ", taboofoodimg=" + taboofoodimg + ", symptom="
				+ symptom + ", regdate=" + regdate + "]";
	}
}
