package com.employee.spring.transaction.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.spring.transaction.dto.EmployeeDetails;
import com.employee.spring.transaction.entity.Department;
import com.employee.spring.transaction.entity.Employee;
import com.employee.spring.transaction.repository.DepartmentRepository;
import com.employee.spring.transaction.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository empRepository;
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Transactional
	public String save(EmployeeDetails empDetails)
	{
		Department dept = new Department();
		dept.setDepartmentName(empDetails.getDepartmentName());
		Department department = departmentRepository.save(dept);
		
		Employee emp = null;
		emp.setDepartmentName(department.getDepartmentName());
		emp.setEmpName(empDetails.getEmpName());
		emp.setEmailId(empDetails.getEmailId());
		
		empRepository.save(emp);
		
		return "Employee saved successfully!!";
	}

}
