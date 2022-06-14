package com.employee.spring.transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.spring.transaction.dto.EmployeeDetails;
import com.employee.spring.transaction.service.EmployeeService;

@RestController
public class SpringController {
	
	@Autowired
	private EmployeeService empService;

	@PostMapping("/register")
	public String register(@RequestBody EmployeeDetails empDetails)
	{
		System.out.println("comed");
		return empService.save(empDetails);
	}
}
