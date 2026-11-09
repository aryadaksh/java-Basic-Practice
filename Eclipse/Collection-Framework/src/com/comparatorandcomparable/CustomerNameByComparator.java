package com.comparatorandcomparable;

import java.util.Comparator;

public class CustomerNameByComparator implements Comparator<Customer> 
{

	public int compare(Customer c1,Customer c2) 
	{
		int result = c2.getCustomerName().compareTo(c1.getCustomerName());
		if(result == 0) {
			result = Integer.compare(c1.getCustomerId(), c2.getCustomerId());
			
		}
		return result;
	}
}
