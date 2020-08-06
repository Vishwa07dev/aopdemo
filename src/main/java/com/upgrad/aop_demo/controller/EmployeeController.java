package com.upgrad.aop_demo.controller;

import com.upgrad.aop_demo.model.Employee;
import com.upgrad.aop_demo.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Vishwa -  30th July 2020
 */
@RestController
public class EmployeeController {

  @Autowired
    private EmployeeService employeeService;

    @PostMapping(value = "/employees")
    public Employee addEmployee(@RequestBody Employee employee)
    {
      // I want to log that I am going inside the addEmployee method
      return employeeService.createEmployee(employee.getId(), employee.getName(), employee.getAge());
    }
    @DeleteMapping (value = "/employees")
    public String removeEmployee( @RequestParam("empId") String empId)
    {
      employeeService.deleteEmployee(empId);
      return "Employee removed";
    }
  }
