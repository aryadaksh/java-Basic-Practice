package com.amazon.shop.pojo;

public class Employee {
	
	private String name;
	private String id;
	public Employee(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public String display() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	

}
