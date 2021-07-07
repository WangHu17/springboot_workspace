package com.example.springboot_cache.controller;

import com.example.springboot_cache.bean.Employee;
import com.example.springboot_cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-06-17 16:50
 */
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id")Integer id){
        return employeeService.getEmp(id);
    }

    @GetMapping("/emp")
    public Employee updateEmp(Employee employee){
        employeeService.updateEmp(employee);
        return employee;
    }

    @GetMapping("/emp/del/{id}")
    public String delEmp(@PathVariable("id")Integer id){
        employeeService.delEmp(id);
        return "success";
    }

}
