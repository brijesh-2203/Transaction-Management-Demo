package com.employee.spring.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.spring.transaction.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
