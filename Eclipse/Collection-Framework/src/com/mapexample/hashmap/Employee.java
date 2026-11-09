package com.mapexample.hashmap;

public class Employee {
	
	private String name;
	private String empId;
	
	public Employee(String name,String empId) {
		this.empId = empId;
		this.name = name;
		
	}
	
	public String getName() {
		return name;
		
	}
	public String getEmpId() {
		return empId;
		
	}
	
	public int hashCode() {
		return this.name.hashCode()+this.empId.hashCode();
	}
	
	public boolean equals(Object obj) {
	
		boolean result =this.name.equals(((Employee) obj).getName()) & this.empId.equals(((Employee) obj).getEmpId());
		
		return result; 
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" "+this.empId;
	}
}
