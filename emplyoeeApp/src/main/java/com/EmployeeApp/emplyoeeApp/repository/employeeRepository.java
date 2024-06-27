package com.EmployeeApp.emplyoeeApp.repository;

import com.EmployeeApp.emplyoeeApp.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepository extends JpaRepository<employee,Long> {
}
