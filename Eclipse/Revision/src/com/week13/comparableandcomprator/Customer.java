package com.week13.comparableandcomprator;

public class Customer implements Comparable<Customer>
{

	private int customerId;
	private String customerName;
	
	public Customer(int customerId,String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public int compareTo(Customer c)
	{
		int result = Integer.compare(this.customerId, c.customerId);
		if(result == 0) {
			result = customerName.compareTo(c.customerName);
		}
		
		return result;
	}
	
}
