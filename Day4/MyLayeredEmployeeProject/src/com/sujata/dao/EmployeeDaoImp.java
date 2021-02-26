package com.sujata.dao;

import java.util.ArrayList;

import com.sujata.bean.Employee;

public class EmployeeDaoImp implements EmployeeDao {

	static private ArrayList<Employee> empList=new ArrayList<>();
	
	static{
		empList.add(new Employee(101, "AAAA", "Associate", "IT", 52000));
		empList.add(new Employee(102, "BBBB", "Manager", "Sales", 152000));
		empList.add(new Employee(103, "CCCC", "Executive", "HR", 42000));
		empList.add(new Employee(104, "DDDD", "Sr. Associate", "IT", 62000));
		empList.add(new Employee(105, "EEEE", "Associate", "Sales", 72000));
		empList.add(new Employee(106, "FFFF", "Sr. Executive", "IT", 72000));
	}

	@Override
	public ArrayList<Employee> getAllRecords() {
		return empList;
	}

	@Override
	public Employee searchRecordById(int id) {
		for(Employee employee:empList){
			if(employee.geteId()==id)
				return employee;
		}
		return null;
	}
	
}
