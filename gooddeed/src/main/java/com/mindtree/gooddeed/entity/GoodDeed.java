package com.mindtree.gooddeed.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "gooddeed")
public class GoodDeed {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deedId;
	private String deedName;
	
	@OneToOne(mappedBy="gooddeed")
	private Supervisor supervisor;
	
	@OneToMany(mappedBy = "gooddeed", cascade = CascadeType.ALL)
	private List<CampusMind> campusmind;

	public GoodDeed() {
		super();
		// TODO Auto-generated constructor stub
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

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}

	public List<CampusMind> getCampusmind() {
		return campusmind;
	}

	public void setCampusmind(List<CampusMind> campusmind) {
		this.campusmind = campusmind;
	}

}
