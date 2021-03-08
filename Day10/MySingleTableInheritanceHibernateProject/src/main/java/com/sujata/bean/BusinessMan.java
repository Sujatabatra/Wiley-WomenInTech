package com.sujata.bean;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "B")
public class BusinessMan extends Person {

	private String natureOfBussiness;
	private int annualTurnover;
	
	public BusinessMan() {
		
	}

	public BusinessMan(int pId, String pName, String natureOfBussiness, int annualTurnover) {
		super(pId, pName);
		this.natureOfBussiness = natureOfBussiness;
		this.annualTurnover = annualTurnover;
	}

	public String getNatureOfBussiness() {
		return natureOfBussiness;
	}

	public void setNatureOfBussiness(String natureOfBussiness) {
		this.natureOfBussiness = natureOfBussiness;
	}

	public int getAnnualTurnover() {
		return annualTurnover;
	}

	public void setAnnualTurnover(int annualTurnover) {
		this.annualTurnover = annualTurnover;
	}
	
	
}
