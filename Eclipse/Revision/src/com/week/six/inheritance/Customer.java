package com.week.six.inheritance;

public class Customer {

	private void internalDetails() {
		System.out.println("Customer.internalDetails()");
	}
	
	void calculatePrice() {
		System.out.println("Customer.calculatePrice()");
	}
	
}

class GoldCustomer extends Customer{
	
	@Override
	void calculatePrice() {
		System.out.println("GoldCustomer.calculatePrice()");
	}
	
}