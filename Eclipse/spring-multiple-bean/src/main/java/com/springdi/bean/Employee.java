package com.springdi.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Employee {
	
	private static final Logger log = LogManager.getLogger();

	private String firstName;
	private String lastName;
	private String  empId;
	public Employee(String firstName, String lastName, String empId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
	}
	
	public void displayDetails() {
		log.info("This is Employee class display() method Started");
		System.out.println("Name"+firstName+" "+lastName);
		System.out.println("Emp Id:"+empId);
		log.info("This is Employee class display() method Ended");
	}
}
