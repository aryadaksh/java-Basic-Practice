package com.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.model.Customer;

public class CustomerRepository {
	
	private Map<Integer,Customer> customers = new HashMap<>();
	
	public void addCustomer(Customer customer) {
		customers.put(customer.getCustomerId(), customer);
	}
	
	public Customer getCustomerById(int id) {
		return customers.get(id);
	}
	
	public Collection<Customer> getAllCustomers(){
		return customers.values();
	}

}
