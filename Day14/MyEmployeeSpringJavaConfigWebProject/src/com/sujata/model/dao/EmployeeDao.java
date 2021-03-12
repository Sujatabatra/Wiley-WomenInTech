package com.sujata.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.model.bean.Employee;

public interface EmployeeDao {

	ArrayList<Employee> getAllRecords();
	Employee searchRecordById(int id);
	boolean insertRecord(Employee employee);
	boolean deleteRecord(int id);
	
}
