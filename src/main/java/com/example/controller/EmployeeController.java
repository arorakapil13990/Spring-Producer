package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;


@RestController
public class EmployeeController {
	
	@RequestMapping(value = "/employee")
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);
		return emp;
	}
	
	@GetMapping(value = "/test")
    public String test() {
        return "This is a test!";
    }
}