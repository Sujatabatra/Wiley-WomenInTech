package com.sujata.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.bean.Employee;

public interface EmployeeDao {

	ArrayList<Employee> getAllRecords()throws ClassNotFoundException,SQLException;
	Employee searchRecordById(int id)throws ClassNotFoundException,SQLException;
}
