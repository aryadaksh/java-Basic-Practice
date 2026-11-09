package com.week13.comparableandcomprator;

import java.util.Comparator;

public class CompareCustomerByName implements Comparator<Customer>
{

	public int compare(Customer c1, Customer c2) {
		int result = c1.getCustomerName().compareTo(c2.getCustomerName());
		if(result == 0) {
			result = Integer.compare(c1.getCustomerId(), c2.getCustomerId());
			
		}
		return result;
	}
	
	
}
