package com.sujata.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Wife {

	@Id
	private int wifeId;
	private String wifeName;
	@OneToOne
	@JoinColumn(name = "HusbandId")
	private Husband husband;
	
	public Wife() {
		
	}
	public Wife(int wifeId, String wifeName) {
		super();
		this.wifeId = wifeId;
		this.wifeName = wifeName;
	}
	public int getWifeId() {
		return wifeId;
	}
	public void setWifeId(int wifeId) {
		this.wifeId = wifeId;
	}
	public String getWifeName() {
		return wifeName;
	}
	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}
	@Override
	public String toString() {
		return "Wife [wifeId=" + wifeId + ", wifeName=" + wifeName + "]";
	}
	public Husband getHusband() {
		return husband;
	}
	public void setHusband(Husband husband) {
		this.husband = husband;
	}
	
	
}
