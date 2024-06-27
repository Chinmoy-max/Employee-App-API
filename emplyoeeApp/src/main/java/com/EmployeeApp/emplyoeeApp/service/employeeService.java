package com.EmployeeApp.emplyoeeApp.service;

import com.EmployeeApp.emplyoeeApp.entity.employee;
import com.EmployeeApp.emplyoeeApp.repository.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class employeeService {

    @Autowired
    private employeeRepository emp;

    public List<employee> findAll(){ return emp.findAll();}

    public employee findById(Long id){return emp.findById(id).orElse(null);}

    public employee save(employee employee){return emp.save(employee);}

    public void deleteById(Long id){ emp.deleteById(id);}



}
