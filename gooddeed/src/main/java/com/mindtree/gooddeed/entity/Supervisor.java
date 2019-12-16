package com.mindtree.gooddeed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Supervisor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int supervisorId;
	private String SupervisorName;
	
	@OneToOne
	@JoinColumn(unique = true)
	private GoodDeed gooddeed;

	public Supervisor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Supervisor(int supervisorId, String supervisorName, GoodDeed gooddeed) {
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

	public GoodDeed getGooddeed() {
		return gooddeed;
	}

	public void setGooddeed(GoodDeed gooddeed) {
		this.gooddeed = gooddeed;
	}

}
