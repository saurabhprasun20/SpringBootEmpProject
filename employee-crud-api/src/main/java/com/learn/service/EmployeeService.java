package com.learn.service;
import java.util.List;

import com.learn.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployee();
	
	public Employee getById(int id);
	
	public void saveOrUpdate(Employee employee);
	
	public void deleteEmployee(int id);

}
