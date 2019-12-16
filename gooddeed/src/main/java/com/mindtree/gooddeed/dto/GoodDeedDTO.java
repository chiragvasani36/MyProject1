 package com.mindtree.gooddeed.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mindtree.gooddeed.entity.CampusMind;
import com.mindtree.gooddeed.entity.Supervisor;
@JsonInclude(Include.NON_NULL)
public class GoodDeedDTO {
	private int deedId;
	private String deedName;
	private SupervisorDTO supervisor;
	
	private List<CampusMindDTO> campusmind;
	public GoodDeedDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GoodDeedDTO(int deedId, String deedName, SupervisorDTO supervisor, List<CampusMindDTO> campusmind) {
		super();
		this.deedId = deedId;
		this.deedName = deedName;
		this.supervisor = supervisor;
		this.campusmind = campusmind;
	}
	
	public GoodDeedDTO(int deedId, String deedName, List<CampusMindDTO> campusmind) {
		super();
		this.deedId = deedId;
		this.deedName = deedName;
		this.campusmind = campusmind;
	}
	public int getDeedId() {
		return deedId;
	}
	public void setDeedId(int deedId) {
		this.deedId = deedId;
	}
	public String getDeedName() {
		return deedName;
	}
	public void setDeedName(String deedName) {
		this.deedName = deedName;
	}
	public SupervisorDTO getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(SupervisorDTO gd) {
		this.supervisor = gd;
	}
	public List<CampusMindDTO> getCampusmind() {
		return campusmind;
	}
	public void setCampusmind(List<CampusMindDTO> campusmind) {
		this.campusmind = campusmind;
	}
	
}
