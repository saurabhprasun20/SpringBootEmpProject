package com.learn.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learn.model.Laptop;
import com.learn.repository.LaptopRepository;

@Service
@Transactional
public class LaptopServiceImpl implements LaptopService{
	
	@Autowired
	LaptopRepository laptopRepo;

	@Override
	public List<Laptop> getAllLaptop() {
		// TODO Auto-generated method stub
		return laptopRepo.findAll();
	}

	@Override
	public Laptop getById(int id) {
		// TODO Auto-generated method stub
		return laptopRepo.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Laptop laptop) {
		// TODO Auto-generated method stub
		laptopRepo.save(laptop);
		
	}

	@Override
	public void deleteLaptop(int id) {
		// TODO Auto-generated method stub
		laptopRepo.deleteById(id);
	}

}
