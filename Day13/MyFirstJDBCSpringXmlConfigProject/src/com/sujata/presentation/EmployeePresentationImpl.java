package com.sujata.presentation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;
import com.sujata.util.EmployeeHelper;

public class EmployeePresentationImpl implements EmployeePresentation {

	private EmployeeService empService;
	
	public EmployeeService getEmpService() {
		return empService;
	}

	public void setEmpService(EmployeeService empService) {
		this.empService = empService;
	}

	@Override
	public void showMenu() {
		System.out.println("1. Show all Employees");
		System.out.println("2. Search Employee By ID");
		System.out.println("3. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner sc=new Scanner(System.in);
		try{
		switch(choice){
		case 1:
			ArrayList<Employee> empList=empService.getAllEmployees();
			for(Employee employee:empList){
				EmployeeHelper.displayEmployee(employee);
			}
			System.out.println("=========================");
			break;
		case 2:
			System.out.println("Enter Employee ID you want to search for : ");
			int id=sc.nextInt();
			Employee emp=empService.searchEmployeeById(id);
			if(emp!=null)
				EmployeeHelper.displayEmployee(emp);
			else
				System.out.println("Employee with id "+id+" doesnot exist");
			System.out.println("=========================");
			break;
		case 3:
			System.out.println("Thanks for using Employee System, Have a Nice Day!");
			System.exit(0);
		default :
			System.out.println("Invalid Choice");
		}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
