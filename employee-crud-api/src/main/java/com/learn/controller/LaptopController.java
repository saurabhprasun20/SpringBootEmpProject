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

import com.learn.model.Laptop;
import com.learn.service.LaptopServiceImpl;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api")
public class LaptopController {
	
	@Autowired
	LaptopServiceImpl service;
	
	@PostMapping("/save")
	public Laptop save(@RequestBody Laptop laptop)
	{
		service.saveOrUpdate(laptop);
		return laptop;
		
	}
	
	@GetMapping("/list")
	public List<Laptop> list()
	{
		return service.getAllLaptop();
		
	}
	
	@GetMapping("/list/{id}")
	public Laptop getById(@PathVariable int id)
	{
		return service.getById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteLaptop(@PathVariable int id)
	{
		service.deleteLaptop(id);
		return "Deleted Successfully";
	}

}
