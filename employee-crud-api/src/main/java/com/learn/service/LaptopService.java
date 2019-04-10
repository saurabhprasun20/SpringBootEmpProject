package com.learn.service;
import java.util.List;

import com.learn.model.Laptop;

public interface LaptopService {
	
	public List<Laptop> getAllLaptop();
	
	public Laptop getById(int id);
	
	public void saveOrUpdate(Laptop laptop);
	
	public void deleteLaptop(int id);	

}
