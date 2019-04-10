package com.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.model.Employee;
import com.learn.service.EmployeeServiceImpl;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl empService;	
	
	@PostMapping("/save")
	public Employee save(@RequestBody Employee employee)
	{
		empService.saveOrUpdate(employee);
		return employee;
		
	}
	
	@GetMapping("/list")
	public List<Employee> list()
	{
		return empService.getAllEmployee();
		
	}
	
	@GetMapping("/list/{id}")
	public Employee getById(@PathVariable int id)
	{
		return empService.getById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id)
	{
		empService.deleteEmployee(id);
		return "Deleted Successfully";
	}

}
