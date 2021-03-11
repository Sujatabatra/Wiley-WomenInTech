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

import com.sujata.bean.Employee;


public class EmployeeDaoImp implements EmployeeDao {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public ArrayList<Employee> getAllRecords() throws SQLException {

		Connection connection = null;
		ArrayList<Employee> empList = new ArrayList<>();

		connection = dataSource.getConnection();

		PreparedStatement statement = connection.prepareStatement("SELECT * FROM EMPLOYEES");

		ResultSet resultSet = statement.executeQuery();
		while (resultSet.next()) {

			Employee employee = new Employee();
			employee.seteId(resultSet.getInt("empId"));
			employee.seteName(resultSet.getString("empName"));
			employee.seteDesig(resultSet.getString("designation"));
			employee.seteDepart(resultSet.getString("department"));
			employee.setSalary(resultSet.getInt("salary"));

			empList.add(employee);
		}
		if (connection != null)
			connection.close();
		return empList;
	}

	@Override
	public Employee searchRecordById(int id) throws SQLException {
		Connection connection = null;
		Employee employee = null;

		connection = dataSource.getConnection();

		PreparedStatement statement = connection.prepareStatement("SELECT * FROM EMPLOYEES WHERE EMPID=?");
		statement.setInt(1, id);

		ResultSet resultSet = statement.executeQuery();
		if (resultSet.next()) {
			employee = new Employee();
			employee.seteId(resultSet.getInt("empId"));
			employee.seteName(resultSet.getString("empName"));
			employee.seteDesig(resultSet.getString("designation"));
			employee.seteDepart(resultSet.getString("department"));
			employee.setSalary(resultSet.getInt("salary"));
		}
		if (connection != null)
		connection.close();

		return employee;
	}

}
