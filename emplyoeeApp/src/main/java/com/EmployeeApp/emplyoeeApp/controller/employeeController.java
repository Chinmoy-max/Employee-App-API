package com.EmployeeApp.emplyoeeApp.controller;


import com.EmployeeApp.emplyoeeApp.entity.employee;
import com.EmployeeApp.emplyoeeApp.service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp")
public class employeeController {

    @Autowired
    private employeeService empService;

    @GetMapping
    public List<employee> getAllEmployee(){return empService.findAll();}

    @GetMapping("/{id}")
    public employee getEmployee(@PathVariable Long id){return empService.findById(id);}

    @PostMapping
    public employee addEmployee(@RequestBody employee employee){
        return empService.save(employee);
    }

    @PutMapping("/{id}")
    public employee updateEmployee(@PathVariable Long id, @RequestBody employee employee){
        return empService.save(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id){
        empService.deleteById(id);
    }

}
