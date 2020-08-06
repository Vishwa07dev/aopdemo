package com.upgrad.aop_demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


/**
 * This is the code to demo the AOP concepts quickly
 */
@Aspect
@Component
public class EmployeeServiceAspect {

  @Before(value = "execution(* com.upgrad.aop_demo.service.EmployeeService.*(..)) && args(empId, name, age)")
  public void beforeAdvice(JoinPoint joinPoint, String empId, String name, int age) {
    System.out.println("Before method:" + joinPoint.getSignature());
    System.out.println("Creating Employee with first name - " + name + " and age - " + age);
  }
}
