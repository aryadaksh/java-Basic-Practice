package com.comparatorandcomparable;

import java.util.Comparator;

public class CustomerIdByComparator implements Comparator<Customer>
{
	public int compare(Customer c1,Customer c2) {
		int result =  Integer.compare(c1.getCustomerId(), c2.getCustomerId());
		if(result == 0) {
			result = c1.getCustomerName().compareTo(c2.getCustomerName());
		}
		
		return result;
	}

}
