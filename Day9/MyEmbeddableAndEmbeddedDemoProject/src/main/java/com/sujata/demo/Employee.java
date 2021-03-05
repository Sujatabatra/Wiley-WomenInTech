package com.sujata.demo;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//we are mapping this class object with DB Table
@Entity  //MetaData
@Table(name="HiberEmp")
public class Employee {

	//Primary Key
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	@Column(name="name")
	private String empName;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="hNo",column = @Column(name="houseNo")),
		@AttributeOverride(name="streetName",column = @Column(name="EmpStreetName")),
		@AttributeOverride(name="city",column = @Column(name="EmpCity")),
		@AttributeOverride(name="state",column = @Column(name="EmpState")),
		@AttributeOverride(name = "pinCode",column=@Column(name="EmpPinCode"))
	})
	private Address empAddr;
	
	@Column(name="deptt")
	private String department;
	private String designation;
	private double salary;
	
	public Employee() {
		
	}

	public Employee(String empName, String department, String designation, double salary) {
		super();
		this.empName = empName;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}

	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public Address getEmpAddr() {
		return empAddr;
	}

	public void setEmpAddr(Address empAddr) {
		this.empAddr = empAddr;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddr=" + empAddr + ", department="
				+ department + ", designation=" + designation + ", salary=" + salary + "]";
	}

	
	
	
}
