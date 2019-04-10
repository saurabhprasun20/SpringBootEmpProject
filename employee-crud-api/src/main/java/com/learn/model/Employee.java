package com.learn.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	
	@Id
	private int empId;
	private String name;
	private String dept;
	@ManyToOne
	private Laptop laptop;
	
	
	public Employee() {
		super();
		
	}	
	
	public Employee(int empId, String name, String dept, Laptop latop) {
		super();
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.laptop = latop;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Laptop getLatop() {
		return laptop;
	}

	public void setLatop(Laptop latop) {
		this.laptop = latop;
	}
	
}
