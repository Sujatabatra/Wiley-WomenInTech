package com.sujata.util;

import com.sujata.bean.Employee;

public class EmployeeHelper {

	public static void displayEmployee(Employee emp){
		System.out.println(emp.geteId()+"  "+emp.geteName()+"  "+emp.geteDesig()+"  "+emp.geteDepart()+"  "+emp.getSalary());
	}
}
