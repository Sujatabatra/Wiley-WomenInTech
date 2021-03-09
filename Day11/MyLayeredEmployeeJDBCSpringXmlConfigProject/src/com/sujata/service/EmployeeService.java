package com.sujata.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.bean.Employee;

public interface EmployeeService {

	ArrayList<Employee> getAllEmployees()throws ClassNotFoundException,SQLException;
	Employee searchEmployeeById(int id)throws ClassNotFoundException,SQLException;
	public Employee convertUpperCase(Employee employee);
}
