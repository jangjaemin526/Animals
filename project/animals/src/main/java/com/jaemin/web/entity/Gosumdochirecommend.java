package com.jaemin.web.entity;

import java.util.Date;

public class Gosumdochirecommend {

	private int id;
	private String gosumdochibreed;
	private String recommendreason;
	private String lifespan;
	private String gosumdochiimg;
	private Date regdate;
	
	public Gosumdochirecommend() {
		
	}

	public Gosumdochirecommend(int id, String gosumdochibreed, String recommendreason, String lifespan,
			String gosumdochiimg, Date regdate) {
		this.id = id;
		this.gosumdochibreed = gosumdochibreed;
		this.recommendreason = recommendreason;
		this.lifespan = lifespan;
		this.gosumdochiimg = gosumdochiimg;
		this.regdate = regdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGosumdochibreed() {
		return gosumdochibreed;
	}

	public void setGosumdochibreed(String gosumdochibreed) {
		this.gosumdochibreed = gosumdochibreed;
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

	public String getGosumdochiimg() {
		return gosumdochiimg;
	}

	public void setGosumdochiimg(String gosumdochiimg) {
		this.gosumdochiimg = gosumdochiimg;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Gosumdochirecommend [id=" + id + ", gosumdochibreed=" + gosumdochibreed + ", recommendreason="
				+ recommendreason + ", lifespan=" + lifespan + ", gosumdochiimg=" + gosumdochiimg + ", regdate="
				+ regdate + "]";
	}
}
