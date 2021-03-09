package com.sujata.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.sujata.bean.Employee;
import com.sujata.util.OracleConnectionManagement;

public class EmployeeDaoImp implements EmployeeDao {

	@Override
	public ArrayList<Employee> getAllRecords() throws ClassNotFoundException, SQLException {

		Connection connection = null;
		ArrayList<Employee> empList = new ArrayList<>();

		connection = OracleConnectionManagement.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","sujata");
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
		connection.close();
		return empList;
	}

	@Override
	public Employee searchRecordById(int id) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		Employee employee = null;

		Class.forName("oracle.jdbc.driver.OracleDriver");

		connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "sujata");

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
		connection.close(); // throwing check exception SQLException

		return employee;
	}

}
