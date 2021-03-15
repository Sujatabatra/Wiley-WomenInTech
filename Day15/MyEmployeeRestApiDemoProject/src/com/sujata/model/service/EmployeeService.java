package com.sujata.model.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.model.bean.Employee;
import com.sujata.model.bean.Employees;

public interface EmployeeService {

	Employees getAllEmployees();
	Employee searchEmployeeById(int id);
	public Employee convertUpperCase(Employee employee);
	public Employee insertEmployee(Employee employee);
	public Employee deleteEmployee(int eid);
	public Employee updateSalaryOfAnEmp(int id,int salary);
	
}
