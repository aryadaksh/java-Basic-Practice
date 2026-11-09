package com.map.question;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Employee {

	int id;

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		
		return ((Employee)obj).id == this.id;
	}

	public Employee(int id) {
		super();
		this.id = id;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee(10);
		Map<Employee, String> map = new HashMap<Employee, String>();
		
		map.put(e, "Daksh");
		e.id = 20;
		System.out.println(map.get(e));
	}
	
}
