

package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CollegeRepository;
import com.example.demo.model.College;

@RestController
public class CollegeController {
	@Autowired
	CollegeRepository collegerep;
	@PostMapping("/insertCollegeData")
	public College saveCollege(@RequestBody College c1)
	{
		College savecollege=collegerep.save(c1);
		return savecollege;
	}

}
