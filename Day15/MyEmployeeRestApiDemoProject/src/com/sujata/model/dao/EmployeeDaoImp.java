package com.sujata.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sujata.model.bean.Employee;
import com.sujata.model.util.EmployeeRowMapper;

@Repository
public class EmployeeDaoImp implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public ArrayList<Employee> getAllRecords() {

		ArrayList<Employee> empList = (ArrayList) jdbcTemplate.query("select * from employees",
				new EmployeeRowMapper());
		return empList;
	}

	@Override
	public Employee searchRecordById(int id) {

		Employee employee = jdbcTemplate.queryForObject("select * from employees where empid=?", new Object[] { id },
				new EmployeeRowMapper());

		return employee;
	}

	@Override
	public Employee insertRecord(Employee employee) {
		String query = "insert into employees values(?,?,?,?,?)";
		int rows = jdbcTemplate.update(query, employee.geteId(), employee.geteName(), employee.geteDesig(),
				employee.geteDepart(), employee.getSalary());
		if (rows > 0)
			return employee;
		return null;
	}

	@Override
	public Employee deleteRecord(int id) {
		String query = "delete from employees where empId=?";
		Employee employee = jdbcTemplate.queryForObject("select * from employees where empid=?", new Object[] { id },
				new EmployeeRowMapper());
		int rows = jdbcTemplate.update(query, id);
		if (rows > 0)
			return employee;
		return null;
	}

	@Override
	public Employee updateSalary(int id, int salary) {
		String query = "update employees set salary=? where empId=?";
		int rows = jdbcTemplate.update(query, salary, id);
		Employee employee = null;
		if (rows > 0) {
			employee = jdbcTemplate.queryForObject("select * from employees where empid=?", new Object[] { id },
					new EmployeeRowMapper());
		}
		return employee;

	}

}
