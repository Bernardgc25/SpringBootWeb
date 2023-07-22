package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.College;


@Repository
public interface CollegeRepository extends JpaRepository<College,Integer>{
	

}
