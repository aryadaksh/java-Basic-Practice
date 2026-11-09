package com.mapexample.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MainApp {
	
	public static void main(String[] args) {
		
		Map<Employee, Integer> empHash = new HashMap<Employee, Integer>();
		empHash.put(new Employee("Daksh Arya","Tcs102"), 10000);
		empHash.put(new Employee("Dawik Arya","Tcs105"), 10000);
		
		System.out.println(empHash);
		
	}

}
