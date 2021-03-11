package com.sujata.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sujata.bean.Employee;
import com.sujata.util.EmployeeRowMapper;

public class EmployeeDaoImp implements EmployeeDao {

	private SessionFactory sessionFactory;

	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public ArrayList<Employee> getAllRecords(){

			Session session=sessionFactory.openSession();
			Transaction transaction=session.beginTransaction();
			
			Query<Employee> query=session.createQuery("from Employee");
			ArrayList<Employee> empList=(ArrayList)query.getResultList();
			
			transaction.commit();
			session.close();
			
			return empList;
	}

	@Override
	public Employee searchRecordById(int id){
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Employee employee=session.get(Employee.class, id);
		
		transaction.commit();
		session.close();
		
		return employee;

	}

	@Override
	public boolean insertRecord(Employee employee) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(employee);
		
		transaction.commit();
		session.close();
		
		return true;
	}

	@Override
	public boolean deleteRecord(int id) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Employee employee=session.get(Employee.class, id);
		session.delete(employee);
		
		transaction.commit();
		session.close();
		
		return true;
	}
	
	

}
