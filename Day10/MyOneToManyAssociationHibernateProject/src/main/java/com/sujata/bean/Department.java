package com.sujata.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id
	private String departmentId;
	private String departmentName;
	
	/*
	 * because of multivalued attribute we are coming across with the third relation 
	 */
	@JoinTable(name = "DeptWiseEmpDetails",
			joinColumns = @JoinColumn(name="deptId"),
			inverseJoinColumns =@JoinColumn(name="empId") 
	)
	@OneToMany
	private List<Employee> employees=new ArrayList<Employee>();
	
	public Department() {
		
	}

	public Department(String departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	
	
}
