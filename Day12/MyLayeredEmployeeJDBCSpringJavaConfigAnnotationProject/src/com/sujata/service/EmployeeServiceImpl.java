package com.sujata.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sujata.bean.Employee;
import com.sujata.dao.EmployeeDao;
import com.sujata.dao.EmployeeDaoImp;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao empDao;

	public void setEmpDao(EmployeeDao empDao) {
		this.empDao = empDao;
	}

	// Bussiness Logic needs data: and dat data it gets from dao
	@Override
	public ArrayList<Employee> getAllEmployees() throws ClassNotFoundException, SQLException {

		return empDao.getAllRecords();
	}

	@Override
	public Employee searchEmployeeById(int id) throws ClassNotFoundException, SQLException {
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

}
