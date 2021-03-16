package com.sujata.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;

@RestController
public class MyEmpResource {
	
	@Autowired
	private EmployeeService empService;

	@GetMapping(path = "/employees/{id}",produces = "application/json")
	private Employee getEmployeeById(@PathVariable("id")int eid) {
		return empService.searchEmployeeById(eid);
		
	}
}
