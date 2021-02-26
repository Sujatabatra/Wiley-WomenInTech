package com.sujata.dao;

import java.util.ArrayList;

import com.sujata.bean.Employee;

public interface EmployeeDao {

	ArrayList<Employee> getAllRecords();
	Employee searchRecordById(int id);
}
