package com.sujata.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Husband {

	@Id
	private int husbandId;
	private String husbandName;
	@OneToOne
	@JoinColumn(name = "WifeID")
	private Wife wife;
	
	public Husband() {
		
	}

	public Husband(int husbandId, String husbandName) {
		super();
		this.husbandId = husbandId;
		this.husbandName = husbandName;
	}

	public int getHusbandId() {
		return husbandId;
	}

	public void setHusbandId(int husbandId) {
		this.husbandId = husbandId;
	}

	public String getHusbandName() {
		return husbandName;
	}

	public void setHusbandName(String husbandName) {
		this.husbandName = husbandName;
	}

	public Wife getWife() {
		return wife;
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}
	
}
