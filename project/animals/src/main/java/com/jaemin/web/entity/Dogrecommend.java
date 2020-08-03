package com.jaemin.web.entity;

import java.util.Date;

public class Dogrecommend {
	
	private int id;
	private String country;
	private String dogbreed;
	private String recommendreason;
	private String lifespan;
	private String dogimg;
	private Date regdate;
	
	public Dogrecommend() {

	}

	public Dogrecommend(int id, String country, String dogbreed, String recommendreason, String lifespan, String dogimg,
			Date regdate) {
		this.id = id;
		this.country = country;
		this.dogbreed = dogbreed;
		this.recommendreason = recommendreason;
		this.lifespan = lifespan;
		this.dogimg = dogimg;
		this.regdate = regdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDogbreed() {
		return dogbreed;
	}

	public void setDogbreed(String dogbreed) {
		this.dogbreed = dogbreed;
	}

	public String getRecommendreason() {
		return recommendreason;
	}

	public void setRecommendreason(String recommendreason) {
		this.recommendreason = recommendreason;
	}

	public String getLifespan() {
		return lifespan;
	}

	public void setLifespan(String lifespan) {
		this.lifespan = lifespan;
	}

	public String getDogimg() {
		return dogimg;
	}

	public void setDogimg(String dogimg) {
		this.dogimg = dogimg;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Dogrecommend [id=" + id + ", country=" + country + ", dogbreed=" + dogbreed + ", recommendreason="
				+ recommendreason + ", lifespan=" + lifespan + ", dogimg=" + dogimg + ", regdate=" + regdate + "]";
	}
}
