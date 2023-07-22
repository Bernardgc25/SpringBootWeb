
package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee,String>{
	public List<Employee> findByFname(String name);
	
	//internally generate query select * from employee where firstname=name;
	public List<Employee> findByLname(String lname);
	public List<Employee> findByOrderBySalaryAsc();
	//select * from employee order by salary, sort by salary  asc= ascending, desc = descending
	

}
