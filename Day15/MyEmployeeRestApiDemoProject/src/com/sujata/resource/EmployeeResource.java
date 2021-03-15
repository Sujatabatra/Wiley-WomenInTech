package com.sujata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.model.bean.Employee;
import com.sujata.model.service.EmployeeService;

@RestController
public class EmployeeResource {

	@Autowired
	private EmployeeService employeeService;
	
//	@RequestMapping(path = "/employees/{id}",method = RequestMethod.GET,produces = "application/xml")
	@GetMapping(path = "/employees/{id}", produces="application/xml")
	public Employee getEmployeeByIDResource(@PathVariable("id")int empId) {
		return employeeService.searchEmployeeById(empId);
	}
	
//	@RequestMapping(path = "/employees/{id}",method = RequestMethod.DELETE,produces = "application/xml")
	@DeleteMapping(path="/employees/{id}",produces = "application/xml")
	public Employee deleteEmployee(@PathVariable("id") int id) {
		return employeeService.deleteEmployee(id);
	}
	
	
}
