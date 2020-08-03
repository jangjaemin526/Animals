package com.jaemin.web.entity;

import java.util.Date;

public class Hospital {

	private int id;
	private String name;
	private String address;
	private String tel;
	private String hospitalimg;
	private Date regdate;
	
	public Hospital() {
	
	}

	public Hospital(int id, String name, String address, String tel, String hospitalimg, Date regdate) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.hospitalimg = hospitalimg;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getHospitalimg() {
		return hospitalimg;
	}

	public void setHospitalimg(String hospitalimg) {
		this.hospitalimg = hospitalimg;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", address=" + address + ", tel=" + tel + ", hospitalimg="
				+ hospitalimg + ", regdate=" + regdate + "]";
	}
}
