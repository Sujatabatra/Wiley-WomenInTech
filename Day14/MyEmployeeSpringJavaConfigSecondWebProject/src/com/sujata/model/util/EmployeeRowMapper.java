package com.sujata.model.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sujata.model.bean.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp=new Employee();
		emp.seteId(rs.getInt("empid"));
		emp.seteName(rs.getString("empname"));
		emp.seteDesig(rs.getString("designation"));
		emp.seteDepart(rs.getString("department"));
		emp.setSalary(rs.getInt("salary"));
		return emp;
		
	}

}
