package com.upgrad.aop_demo.model;

import java.util.Objects;


/**
 * This class will be used for Employee resource
 */
public class Employee {

  private String id ;
  private String name ;
  private int age ;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return age == employee.age && Objects.equals(id, employee.id) && Objects.equals(name, employee.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, age);
  }

  @Override
  public String toString() {
    return "Employee{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", age=" + age + '}';
  }
}
