package com.sujata.model.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.model.bean.Employee;

public interface EmployeeService {

	ArrayList<Employee> getAllEmployees();
	Employee searchEmployeeById(int id);
	public Employee convertUpperCase(Employee employee);
	public boolean insertEmployee(Employee employee);
	public boolean deleteEmployee(int eid);
	
}
