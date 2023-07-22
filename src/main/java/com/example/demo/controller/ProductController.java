package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.demo.model.*;
import com.example.demo.dao.ProductRepository;
/*
 RequestMapping
 GetMapping--To retreive data
 PostMapping-to insert data
 PutMapping-to update data
 DeleteMapping-to delete data
 */
@RestController
public class ProductController {
	@Autowired
	ProductRepository productrep;
	
	@GetMapping("/retreive")
	public List<Product> getProduct()
	{
		return productrep.findAll();
	}
	@PostMapping("/insertData")
	public Product insertProduct(@RequestBody Product p1)
	{
		Product pinsert=productrep.save(p1);
		return pinsert;
		
	}
	@PutMapping("/updateData/{productid}")
	public Product updateData(@PathVariable("productid")int pid,
			@RequestBody Product pupdatedata)
	{
		Optional<Product> pfind=productrep.findById(pid);
		Product pupdate=null;
		if(pfind.isPresent())
		{
				pupdate=pfind.get();	
		}
		pupdate.setProductname(pupdatedata.getProductname());
		return pupdate;
	}
	
	

}


