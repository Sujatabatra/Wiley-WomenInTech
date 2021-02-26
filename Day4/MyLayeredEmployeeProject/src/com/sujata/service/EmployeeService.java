package com.sujata.service;

import java.util.ArrayList;

import com.sujata.bean.Employee;

public interface EmployeeService {

	ArrayList<Employee> getAllEmployees();
	Employee searchEmployeeById(int id);
	public Employee convertUpperCase(Employee employee);
}
