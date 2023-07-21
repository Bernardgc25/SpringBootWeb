package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.demo.model.*;
import com.example.demo.dao.ProductRepository;

import antlr.collections.List;


/*
 * RequestMapping
 * GetMapping--To retrieve data
 * PostMapping-to insert data
 * PutMapping-to update data
 * DeleteMapping-to delete data 
 * 
 */
@RestController
//retrieve data from database
public class ProductController {
	@Autowired
	ProductRepository productrep;
	@GetMapping("/retrieve")
	
	public List<Product> getProduct(){
		return productrep.findAll();
	}
}
