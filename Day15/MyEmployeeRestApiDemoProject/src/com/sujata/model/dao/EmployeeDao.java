package com.sujata.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.model.bean.Employee;

public interface EmployeeDao {

	ArrayList<Employee> getAllRecords();
	Employee searchRecordById(int id);
	Employee insertRecord(Employee employee);
	Employee deleteRecord(int id);
	Employee updateSalary(int id,int salary);
}
