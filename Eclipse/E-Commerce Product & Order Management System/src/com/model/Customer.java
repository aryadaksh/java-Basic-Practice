package com.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Customer {

	private final static AtomicInteger UNIQUE_ID = new AtomicInteger(99999);

	private int customerId;
	private String name;
	private String email;
	private String mobile;
	private String address;

	
	// Constructors
	
	public Customer(/* int customerId, */ String name, String email, String mobile, String address) {
		super();
		this.customerId = UNIQUE_ID.incrementAndGet();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}

	// Getters

	public String getAddress() {
		return address;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getMobile() {
		return mobile;
	}

	// Setters
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setMobile(String newMobile) {
		this.mobile = newMobile;
	}
	
	public void setEmail(String newEmail) {
		this.email = newEmail;
		
	}

	// Overriding toString
	@Override
	public String toString() {
	    return "\n*********************************************\n" +
	           "              👤 Customer Profile              \n" +
	           "*********************************************\n" +
	           " Customer ID        :: " + customerId + "\n" +
	           " Name               :: " + name + "\n" +
	           " Email              :: " + email + "\n" +
	           " Mobile Number      :: " + mobile + "\n" +
	           " Address            :: " + address + "\n" +
	           "*********************************************\n";
	}


	
}
