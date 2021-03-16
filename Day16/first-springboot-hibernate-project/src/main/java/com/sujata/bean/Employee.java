package com.sujata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employees")
public class Employee {

	@Id
	@Column(name="empId")
	private int eId;
	@Column(name="empName")
	private String eName;
	@Column(name="designation")
	private String eDesig;
	@Column(name="department")
	private String eDepart;
	@Column(name="salary")
	private int salary;
	
	public Employee(){
		
	}

	public Employee(int eId, String eName, String eDesig, String eDepart, int salary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eDesig = eDesig;
		this.eDepart = eDepart;
		this.salary = salary;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteDesig() {
		return eDesig;
	}

	public void seteDesig(String eDesig) {
		this.eDesig = eDesig;
	}

	public String geteDepart() {
		return eDepart;
	}

	public void seteDepart(String eDepart) {
		this.eDepart = eDepart;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eDesig=" + eDesig + ", eDepart=" + eDepart + ", salary="
				+ salary + "]";
	}
	
	
}
