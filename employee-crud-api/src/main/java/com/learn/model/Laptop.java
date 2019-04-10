package com.learn.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {
	
	@Id
	private int laptopId;
	private String laptopBrand;
	private String modelName;
	
	
	public Laptop() {
		super();
	}
	
	
	public Laptop(int laptopId, String laptopBrand, String modelName) {
		super();
		this.laptopId = laptopId;
		this.laptopBrand = laptopBrand;
		this.modelName = modelName;
	}
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopBrand() {
		return laptopBrand;
	}
	public void setLaptopBrand(String laptopBrand) {
		this.laptopBrand = laptopBrand;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopBrand=" + laptopBrand + ", modelName=" + modelName + "]";
	}
	
	

}
