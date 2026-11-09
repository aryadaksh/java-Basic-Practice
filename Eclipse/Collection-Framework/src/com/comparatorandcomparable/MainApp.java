package com.comparatorandcomparable;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Collections;


public class MainApp {
	
	public static void main(String[] args)
	{
		List<Customer> customers = new ArrayList<Customer>();
		
		customers.add(new Customer(234,"Masood Raza"));
		customers.add(new Customer(987865," Praween"));
		customers.add(new Customer(7654,"Arya"));
		customers.add(new Customer(65467894,"Suman"));
		
		Collections.sort(customers,new CustomerIdByComparator());
		
		for (Customer customer : customers) {
			System.out.println(customer.getCustomerId()+"-->"+customer.getCustomerName());
		}
		
		System.out.println("=====================================================");
		
		Collections.sort(customers,new CustomerNameByComparator());
		
		ListIterator<Customer> lItr = customers.listIterator();
		
		while(lItr.hasNext()) {
			Customer c = lItr.next();
			if(c.getCustomerName().equals("Arya")) {
				if(lItr.hasPrevious()) {
				Customer	prev = lItr.previous();
					System.out.println(prev.getCustomerName());
					lItr.next();
				}
				
				continue;
			}
			
			System.out.println(c.getCustomerId()+" ,"+c.getCustomerName());
		}
		
		
	}

}
