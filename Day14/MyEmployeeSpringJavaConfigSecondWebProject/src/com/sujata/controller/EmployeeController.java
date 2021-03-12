package com.sujata.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
		ModelAndView mv=new ModelAndView();
//		mv.addObject("command", new Employee());
		mv.addObject("employee", new Employee());
		mv.setViewName("InsertEmployee");
		return mv;
//		return new ModelAndView("InsertEmployee","command",new Employee());
	}

	@ModelAttribute("IDs")
	public List<Integer> getAllEmpIds(){
		ArrayList<Employee> empList=empService.getAllEmployees();
		List empIds=empList.stream().map(Employee::geteId).collect(Collectors.toList());
		return empIds;
	}
	@ModelAttribute("departments")
	public List<String> getAllDepartments(){
		ArrayList<Employee> empList=empService.getAllEmployees();
		List departs=empList.stream().map(Employee::geteDepart).distinct().collect(Collectors.toList());
		return departs;
	}
	
	@ModelAttribute("designations")
	public List<String> getAllDesignations(){
		ArrayList<Employee> empList=empService.getAllEmployees();
		List desigs=empList.stream().map(Employee::geteDesig).distinct().collect(Collectors.toList());
		return desigs;
	}
	
	@RequestMapping("/saveEmp")
	public ModelAndView insertEmployee(@ModelAttribute("employee") Employee employee) {
		ModelAndView mv=new ModelAndView();
		
		String message=null;
		if(empService.insertEmployee(employee))
			message="Employee Record Inserted Succesfully!";
		else
			message="Employee Record Insertion Failed";
		mv.addObject("message", message);
		mv.setViewName("result");
		return mv;
	}
//	@RequestMapping("/saveEmp")
//	public ModelAndView insertEmployee(HttpServletRequest request) {
//		ModelAndView mv=new ModelAndView();
//		Employee employee=new Employee();
//		employee.seteId(Integer.parseInt(request.getParameter("empId")));
//		employee.seteName(request.getParameter("empName"));
//		employee.seteDepart(request.getParameter("deptt"));
//		employee.seteDesig(request.getParameter("desig"));
//		employee.setSalary(Integer.parseInt(request.getParameter("salary")));
//		String message=null;
//		if(empService.insertEmployee(employee))
//			message="Employee Record Inserted Succesfully!";
//		else
//			message="Employee Record Insertion Failed";
//		mv.addObject("message", message);
//		mv.setViewName("result");
//		return mv;
//	}
	
	@RequestMapping("/searchEmpPage")
	public ModelAndView searchEmpPageController() {
		return new ModelAndView("SearchEmp","command",new Employee());
	}

	
	@RequestMapping("/searchEmp")
	public ModelAndView searchEmployeeController(@ModelAttribute Employee emp) {
		ModelAndView mv=new ModelAndView();
		String message=null;
		Employee employee=empService.searchEmployeeById(emp.geteId());
		
			mv.addObject("employee", employee);
			mv.setViewName("ShowEmployee");
				
		return mv;
	}
//	@RequestMapping("/searchEmp")
//	public ModelAndView searchEmployeeController(HttpServletRequest  request) {
//		ModelAndView mv=new ModelAndView();
//		int empId=Integer.parseInt(request.getParameter("empId"));
//		String message=null;
//		Employee employee=empService.searchEmployeeById(empId);
//		if(employee==null) {
//			message =" Employee with id "+empId+" does not exist";
//			mv.addObject("message", message);
//			mv.setViewName("result");
//		}
//		else {
//			mv.addObject("employee", employee);
//			mv.setViewName("ShowEmployee");
//		}		
//		return mv;
//	}
	
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
