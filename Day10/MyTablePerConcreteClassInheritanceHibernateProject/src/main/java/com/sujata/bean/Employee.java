package com.sujata.bean;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Employee extends Person {

	private String designation;
	private String department;
	private String salary;
	
	public Employee() {
		
	}

	public Employee(int pId, String pName, String designation, String department, String salary) {
		super(pId, pName);
		this.designation = designation;
		this.department = department;
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
}
