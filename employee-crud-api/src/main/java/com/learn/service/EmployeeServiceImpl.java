package com.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learn.model.Employee;
import com.learn.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository empRepo;

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return empRepo.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Employee employee) {
		// TODO Auto-generated method stub
		empRepo.save(employee);
		
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		empRepo.deleteById(id);
		
	}
	

}
