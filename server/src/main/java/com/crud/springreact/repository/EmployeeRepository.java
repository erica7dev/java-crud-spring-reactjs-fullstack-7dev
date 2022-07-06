package com.crud.springreact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.springreact.model.Employee;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
  
}
