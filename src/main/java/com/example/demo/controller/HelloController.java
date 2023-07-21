package com.example.demo.controller;
import com.example.demo.dao.EmployeeRepository;
import com.example.demo.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@Autowired
	EmployeeRepository emprep;
	@RequestMapping("/index")
	public String getPage()
	{
		System.out.println("Coming here");
		return "Welcome";
	}
	@RequestMapping("/edata")
	public ModelAndView getEData()
	{
		Employee emp=new Employee();
		//emp.setFname("John");
		//emp.setLname("Warne");
		//emp.setSalary(23432);
		return new ModelAndView("EmployeeData","edata",emp);
		
	}
	@RequestMapping("/insertUser")
	public String getresult(@ModelAttribute("edata") Employee e1)
	{
		System.out.println("Employee First Name is " +e1.getFname());
		System.out.println("Employee Last Name is " +e1.getLname());
		System.out.println("Salary is " +e1.getSalary());
		emprep.save(e1);
		
		return "Success";
	}
	
	

}
