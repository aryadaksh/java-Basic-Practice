package com.springdi.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private String firstName;
	private String lastName;
	private String empId;
	
	@Autowired
	private Address address;

	public Employee(String firstName, String lastName, String empId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
	}

	
	public String display() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", empId=" + empId + ", address="
				+ address.disAdd() + "]";
	}
	
	

}
