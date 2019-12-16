package com.mindtree.gooddeed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Campmind")
public class CampusMind {
	@Id
	@Column(name = "MindId")
	private int mid;

	@Column(name = "MindName")
	private String name;

	@ManyToOne
	private GoodDeed gooddeed;

	public CampusMind() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CampusMind(int mid, String name, GoodDeed gooddeed) {
		super();
		this.mid = mid;
		this.name = name;
		this.gooddeed = gooddeed;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GoodDeed getGooddeed() {
		return gooddeed;
	}

	public void setGooddeed(GoodDeed gooddeed) {
		this.gooddeed = gooddeed;
	}

}
