package com.jaemin.web.entity;

import java.util.Date;

public class Hamsterrecommend {
	
	private int id;
	private String hamsterbreed;
	private String recommendreason;
	private String lifespan;
	private String hamsterimg;
	private Date regdate;

	public Hamsterrecommend() {
		
	}

	public Hamsterrecommend(int id, String hamsterbreed, String recommendreason, String lifespan, String hamsterimg,
			Date regdate) {
		this.id = id;
		this.hamsterbreed = hamsterbreed;
		this.recommendreason = recommendreason;
		this.lifespan = lifespan;
		this.hamsterimg = hamsterimg;
		this.regdate = regdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHamsterbreed() {
		return hamsterbreed;
	}

	public void setHamsterbreed(String hamsterbreed) {
		this.hamsterbreed = hamsterbreed;
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

	public String getHamsterimg() {
		return hamsterimg;
	}

	public void setHamsterimg(String hamsterimg) {
		this.hamsterimg = hamsterimg;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Hamsterrecommend [id=" + id + ", hamsterbreed=" + hamsterbreed + ", recommendreason=" + recommendreason
				+ ", lifespan=" + lifespan + ", hamsterimg=" + hamsterimg + ", regdate=" + regdate + "]";
	}
}
