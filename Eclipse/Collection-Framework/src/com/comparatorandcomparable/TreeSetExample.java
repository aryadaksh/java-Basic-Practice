package com.comparatorandcomparable;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class TreeSetExample {
	
	public static void main(String[] args) {
		Set<Customer> customers = new TreeSet<Customer>(new CustomerNameByComparator());
		customers.add(new Customer(234,"Masood Raza"));
		customers.add(new Customer(987865," Praween"));
		customers.add(new Customer(7654,"Arya"));
		customers.add(new Customer(65467894,"Suman"));
		
		//Collections.sort(customers,new CustomerIdByComparator());
		
//		for (Customer customer : customers) {
//			System.out.println(customer.getCustomerId()+"-->"+customer.getCustomerName());
//		}
		
		Iterator<Customer> itr = customers.iterator();
		while(itr.hasNext()) {
			
			Customer c = itr.next();
			System.out.println(c.getCustomerId()+" "+c.getCustomerName());
		}
	}

}
