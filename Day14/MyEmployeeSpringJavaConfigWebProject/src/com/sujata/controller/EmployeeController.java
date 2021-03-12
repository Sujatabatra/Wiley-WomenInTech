package com.sujata.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.model.bean.Employee;
import com.sujata.model.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@RequestMapping("/")
	public ModelAndView mainPageController() {
		return new ModelAndView("MainPage");
	}
	
	@RequestMapping("/insertEmployeePage")
	public ModelAndView insertEmpPageController() {
		return new ModelAndView("InsertEmployee");
	}
	
	@RequestMapping("/saveEmp")
	public ModelAndView insertEmployee(HttpServletRequest request) {
		ModelAndView mv=new ModelAndView();
		Employee employee=new Employee();
		employee.seteId(Integer.parseInt(request.getParameter("empId")));
		employee.seteName(request.getParameter("empName"));
		employee.seteDepart(request.getParameter("deptt"));
		employee.seteDesig(request.getParameter("desig"));
		employee.setSalary(Integer.parseInt(request.getParameter("salary")));
		String message=null;
		if(empService.insertEmployee(employee))
			message="Employee Record Inserted Succesfully!";
		else
			message="Employee Record Insertion Failed";
		mv.addObject("message", message);
		mv.setViewName("result");
		return mv;
	}
	
	@RequestMapping("/searchEmpPage")
	public ModelAndView searchEmpPageController() {
		return new ModelAndView("SearchEmp");
	}

	@RequestMapping("/searchEmp")
	public ModelAndView searchEmployeeController(HttpServletRequest  request) {
		ModelAndView mv=new ModelAndView();
		int empId=Integer.parseInt(request.getParameter("empId"));
		String message=null;
		Employee employee=empService.searchEmployeeById(empId);
		if(employee==null) {
			message =" Employee with id "+empId+" does not exist";
			mv.addObject("message", message);
			mv.setViewName("result");
		}
		else {
			mv.addObject("employee", employee);
			mv.setViewName("ShowEmployee");
		}		
		return mv;
	}
	
	@RequestMapping("/deleteEmpPage")
	public String deleteEmpPageController() {
		return "DeleteEmp";
	}
	
	@RequestMapping("/deleteEmp")
	public ModelAndView deleteEmployeeController(HttpServletRequest request) {
		ModelAndView mv=new ModelAndView();
		int empId=Integer.parseInt(request.getParameter("empId"));
		String message=null;
		if(empService.deleteEmployee(empId))
			message="Employee Deleted";
		else
			message="Employee Deletion Failed";
		mv.addObject("message", message);
		mv.setViewName("result");
		return mv;
	}
	
	@RequestMapping("/showEmployees")
	public ModelAndView showAllEmpsController() {
		ModelAndView mv=new ModelAndView();
		ArrayList<Employee> empList=empService.getAllEmployees();
		mv.addObject("employeeList", empList);
		mv.setViewName("ShowAllEmployees");
		return mv;
		
		
	}
}
