package com.comparatorandcomparable;

import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
	
	public static void main(String[] args) {
		
		Customer c1 = new Customer(234,"Masood Raza");
		Customer c2 =new Customer(987865," Praween");
		Customer c3 =new Customer(7654,"Arya");
		Customer c4 = new Customer(65467894,"Suman");
		
		Map<Customer,Boolean> customers = new TreeMap<Customer,Boolean>(new CustomerIdByComparator());
		customers.put(c1,true);
		customers.put(c2,true);
		customers.put(c3,false);
		customers.put(c4,true);
		
		//Collections.sort(customers,new CustomerIdByComparator());
		
//		for (Customer customer : customers) {
//			System.out.println(customer.getCustomerId()+"-->"+customer.getCustomerName());
//		}
		
		Set<Entry<Customer,Boolean>> enterySet = customers.entrySet();
		
		Iterator<Entry<Customer,Boolean>> itr = enterySet.iterator();
		while(itr.hasNext()) {
			
			Entry<Customer,Boolean> e = itr.next();
			
			Customer cus = e.getKey();
			
			
			
			
		
			System.out.println(cus.getCustomerId()+"  "+cus.getCustomerName()+" "+e.getValue());
		}
		
	}

}
