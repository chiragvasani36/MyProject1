package com.mindtree.gooddeed.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class CampusMindDTO {
	private int mid;
	private String name;
	private GoodDeedDTO gooddeed;
	public CampusMindDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CampusMindDTO(int mid, String name, GoodDeedDTO gooddeed) {
		super();
		this.mid = mid;
		this.name = name;
		this.gooddeed = gooddeed;
	}

	public CampusMindDTO(int mid, String name) {
		super();
		this.mid = mid;
		this.name = name;
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
	public GoodDeedDTO getGooddeed() {
		return gooddeed;
	}
	public void setGooddeed(GoodDeedDTO gooddeed) {
		this.gooddeed = gooddeed;
	}
	
}
