package com.jaemin.web.entity;

import java.util.Date;

public class Catrecommend {
	
	private int id;
	private String country;
	private String catbreed;
	private String recommendreason;
	private String lifespan;
	private String catimg;
	private Date regdate;

	public Catrecommend() {
	}

	public Catrecommend(int id, String country, String catbreed, String recommendreason, String lifespan, String catimg,
			Date regdate) {
		this.id = id;
		this.country = country;
		this.catbreed = catbreed;
		this.recommendreason = recommendreason;
		this.lifespan = lifespan;
		this.catimg = catimg;
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

	public String getCatbreed() {
		return catbreed;
	}

	public void setCatbreed(String catbreed) {
		this.catbreed = catbreed;
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

	public String getCatimg() {
		return catimg;
	}

	public void setCatimg(String catimg) {
		this.catimg = catimg;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Catrecommend [id=" + id + ", country=" + country + ", catbreed=" + catbreed + ", recommendreason="
				+ recommendreason + ", lifespan=" + lifespan + ", catimg=" + catimg + ", regdate=" + regdate + "]";
	}
}
