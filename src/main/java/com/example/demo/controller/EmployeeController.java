package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.demo.dao.EmployeeRepository;
import com.example.demo.model.Employee;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepository emprep;
	@GetMapping("/retreiveByname/{name}")
	public List<Employee> getEmpList(@PathVariable("name") String n)
	{
		return emprep.findByFname(n);
	}
	@GetMapping("/SortingEmp")
	public List<Employee> getDetails()
	{
		return emprep.findByOrderBySalaryAsc();
	}
}
