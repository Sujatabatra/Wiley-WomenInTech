package com.sujata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.model.bean.Employee;
import com.sujata.model.bean.Employees;
import com.sujata.model.service.EmployeeService;

@RestController

public class EmployeeJsonResource {

	@Autowired
	private EmployeeService employeeService;
	

	@GetMapping(path = "/json/employees/{id}", produces="application/json")
	public Employee getEmployeeByIDResource(@PathVariable("id")int empId) {
		return employeeService.searchEmployeeById(empId);
	}
	
	@DeleteMapping(path="/json/employees/{id}",produces = "application/json")
	public Employee deleteEmployee(@PathVariable("id") int id) {
		return employeeService.deleteEmployee(id);
	}
	
	@PostMapping(path = "/json/employees", produces = "application/json",consumes ="application/json" )
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.insertEmployee(employee);
	}
	
	@GetMapping(path="/json/employees",produces = "application/json")
	public Employees getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@PutMapping(path="/json/employees/{id}/{sal}",produces = "application/json")
	public Employee UpdateSalary(@PathVariable("id")int id,@PathVariable("sal") int salary) {
		return employeeService.updateSalaryOfAnEmp(id, salary);
	}
	
	
}
