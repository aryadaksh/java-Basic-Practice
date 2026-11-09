package com.week.nine;

public class Employee implements Cloneable
{
	
	 String name;
	 Address address;
	public Employee(String name,Address address) {
		this.name = name;
		this.address = address;
	}
	
	public String getDetails() {
	
		return name+
				"\n"+
				address;
	}
	
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}
