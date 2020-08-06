package com.upgrad.aop_demo.service;

import com.upgrad.aop_demo.model.Employee;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

  public Employee createEmployee( String empId, String name, int age)

  {

    Employee emp = new Employee();
    emp.setId(empId);
    emp.setName(name);
    emp.setAge(age);
    return emp;
  }
  public void deleteEmployee(String empId)
  {

  }


}
