package com.sujata.service;

import java.util.ArrayList;

import com.sujata.bean.Employee;
import com.sujata.dao.EmployeeDao;
import com.sujata.dao.EmployeeDaoImp;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao empDao=new EmployeeDaoImp();
	
	@Override
	public ArrayList<Employee> getAllEmployees() {
		
		return empDao.getAllRecords();
	}

	@Override
	public Employee searchEmployeeById(int id) {
		Employee emp=empDao.searchRecordById(id);
		if(emp!=null)
			return convertUpperCase(emp);
		return emp;
	}
	
	public Employee convertUpperCase(Employee employee){
		employee.seteName(employee.geteName().toUpperCase());
		employee.seteDepart(employee.geteDepart().toUpperCase());
		employee.seteDesig(employee.geteDesig().toUpperCase());
		return employee;
	}

}
