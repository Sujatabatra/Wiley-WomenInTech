package com.sujata.model.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.model.bean.Employee;
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
	public ArrayList<Employee> getAllEmployees()  {

		return empDao.getAllRecords();
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
	public boolean insertEmployee(Employee employee) {
		return empDao.insertRecord(employee);
	}

	@Override
	public boolean deleteEmployee(int eid) {
		return empDao.deleteRecord(eid);
	}

}
