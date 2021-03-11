package com.sujata.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.bean.Employee;

public interface EmployeeService {

	ArrayList<Employee> getAllEmployees()throws SQLException;
	Employee searchEmployeeById(int id)throws SQLException;
	public Employee convertUpperCase(Employee employee);
	
}
