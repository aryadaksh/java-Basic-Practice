package com.springdi.bean;

public class Employee {
	
	private String firstName;
	private String lastName;
	private String empId;
	
	private Address address;

	public Employee(String firstName, String lastName, String empId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	public String displayDetails() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", empId=" + empId + ", address="
				+ address.display() + "]";
	}
	
	

}
