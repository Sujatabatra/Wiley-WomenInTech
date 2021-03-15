package com.sujata.model.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.sujata.model.bean.Employee;
import com.sujata.model.bean.Employees;
import com.sujata.model.dao.EmployeeDao;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao empDao;

	public void setEmpDao(EmployeeDao empDao) {
		this.empDao = empDao;
	}

	// Bussiness Logic needs data: and dat data it gets from dao
	@Override
	public Employees getAllEmployees()  {
		Employees employees=new Employees();
		employees.setEmployees(empDao.getAllRecords());
		return employees;
	}

	@Override
	public Employee searchEmployeeById(int id) {
		// Contacted Dao for data purpose
		Employee emp = empDao.searchRecordById(id);
		if (emp != null)
			// Bussiness Logic
			return convertUpperCase(emp);
		return emp;
	}

	// Bussiness Logic
	public Employee convertUpperCase(Employee employee) {
		employee.seteName(employee.geteName().toUpperCase());
		employee.seteDepart(employee.geteDepart().toUpperCase());
		employee.seteDesig(employee.geteDesig().toUpperCase());
		return employee;
	}

	@Override
	public Employee insertEmployee(Employee employee) {
		return empDao.insertRecord(employee);
	}

	@Override
	public Employee deleteEmployee(int eid) {
		return empDao.deleteRecord(eid);
	}

	@Override
	public Employee updateSalaryOfAnEmp(int id, int salary) {
		
		return empDao.updateSalary(id, salary);
	}

}
