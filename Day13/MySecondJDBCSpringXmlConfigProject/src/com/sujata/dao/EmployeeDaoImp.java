package com.sujata.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sujata.bean.Employee;
import com.sujata.util.EmployeeRowMapper;

public class EmployeeDaoImp implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public ArrayList<Employee> getAllRecords(){

			ArrayList<Employee> empList=(ArrayList)jdbcTemplate.query("select * from employees", new EmployeeRowMapper());
			return empList;
	}

	@Override
	public Employee searchRecordById(int id){
		
		
		Employee employee = jdbcTemplate.queryForObject("select * from employees where empid=?", new Object[] {id}, new EmployeeRowMapper());

			return employee;
	}

	@Override
	public boolean insertRecord(Employee employee) {
		String query="insert into employees values(?,?,?,?,?)";
		int rows=jdbcTemplate.update(query, employee.geteId(),employee.geteName(),employee.geteDesig(),employee.geteDepart(),employee.getSalary());
		if(rows>0)
			return true;
		return false;
	}

	@Override
	public boolean deleteRecord(int id) {
		String query="delete from employees where empId=?";
		int rows=jdbcTemplate.update(query,id);
		if(rows>0)
			return true;
		return false;
	}
	
	

}
