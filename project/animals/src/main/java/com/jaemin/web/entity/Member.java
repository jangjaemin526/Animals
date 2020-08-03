package com.jaemin.web.entity;

import java.util.Date;

public class Member {

	private int id;
	private String uid;
	private String name;
	private String pwd;
	private String gender;
	private String birthday;
	private String phone;
	private String email;
	private Date regdate;
	
	public Member() {
		
	}

	public Member(int id, String uid, String name, String pwd, String gender, String birthday, String phone,
			String email, Date regdate) {
		this.id = id;
		this.uid = uid;
		this.name = name;
		this.pwd = pwd;
		this.gender = gender;
		this.birthday = birthday;
		this.phone = phone;
		this.email = email;
		this.regdate = regdate;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", uid=" + uid + ", name=" + name + ", pwd=" + pwd + ", gender=" + gender
				+ ", birthday=" + birthday + ", phone=" + phone + ", email=" + email + ", regdate=" + regdate + "]";
	}
}
