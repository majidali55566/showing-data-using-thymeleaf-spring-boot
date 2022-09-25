package com.majid.SpringPractice.controllers;

import java.util.Objects;

public class Product {
	private String name;
	private String type;
	private String brand;
	
	
	public Product(String name, String type, String brand) {
		super();
		this.name = name;
		this.type = type;
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public int hashCode() {
		return Objects.hash(brand, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", type=" + type + ", brand=" + brand + "]";
	}
	
	
	
	
	
	
	

}
