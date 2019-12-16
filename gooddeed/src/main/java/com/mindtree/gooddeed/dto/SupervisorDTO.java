package com.mindtree.gooddeed.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SupervisorDTO {
	private int supervisorId;
	private String SupervisorName;
	private GoodDeedDTO gooddeed;
	public SupervisorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SupervisorDTO(int supervisorId, String supervisorName, GoodDeedDTO gooddeed) {
		super();
		this.supervisorId = supervisorId;
		SupervisorName = supervisorName;
		this.gooddeed = gooddeed;
	}
	public int getSupervisorId() {
		return supervisorId;
	}
	public void setSupervisorId(int supervisorId) {
		this.supervisorId = supervisorId;
	}
	public String getSupervisorName() {
		return SupervisorName;
	}
	public void setSupervisorName(String supervisorName) {
		SupervisorName = supervisorName;
	}
	public GoodDeedDTO getGooddeed() {
		return gooddeed;
	}
	public void setGooddeed(GoodDeedDTO gooddeed) {
		this.gooddeed = gooddeed;
	}
	
}
