package com.service;

import java.util.Collection;

import com.exception.CustomerNotFoundException;
import com.model.Customer;
import com.repository.CustomerRepository;

public class CustomerService {

	private CustomerRepository customerRepository;

	// Constructor
	public CustomerService(CustomerRepository _customerRepository) {
		this.customerRepository = _customerRepository;
	}

	// Register New Customer-> calling internally Customer Repo
	public void registerCustomer(Customer customer) {
		customerRepository.addCustomer(customer);
	}
	
	public Customer login(int id, String email) throws CustomerNotFoundException {
	    Customer c = customerRepository.getCustomerById(id);
	    if (c == null || !c.getEmail().equalsIgnoreCase(email)) {
	        throw new CustomerNotFoundException("Invalid login credentials!");
	    }
	    return c;
	}


	// Viewing Customer USing id
	public Customer viewCustomer(int id) {
		
		return customerRepository.getCustomerById(id);
		
	}
	
	//changing the address
	public void updateAddress(int id, String newAddress) {
		Customer c = customerRepository.getCustomerById(id);
		if(c != null) {
			c.setAddress(newAddress);
		}
	}
	
	// Changing the mobile Number
	public void updateMobile(int id, String newMobile) {
		Customer c = customerRepository.getCustomerById(id);
		if(c!= null) {
			c.setMobile(newMobile);
		}
	}
	
	//changing the email
	public void updateEmail(int id, String newEmail) {
		Customer c = customerRepository.getCustomerById(id);
		if(c!= null) {
			c.setEmail(newEmail);
		}
	}
	
	// Viewing all the customer
	public Collection<Customer> viewAllCustomer(){
		return customerRepository.getAllCustomers();
	}

	

}
