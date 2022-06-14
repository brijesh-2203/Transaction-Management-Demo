package com.employee.spring.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.spring.transaction.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {

}
