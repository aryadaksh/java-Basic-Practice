package com.week12;

import java.util.Objects;

public class Employee {
	
	private  String employeeName;
	private int employeeId;
	
	public Employee(String employeeName,int employeeId) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		
	}
	
	public String getEmployeeDetails() {
		return employeeName+" "+employeeId;
	}
	
	
	public int hashCode() {
		return this.employeeId+this.employeeName.hashCode();
	}
	
	public boolean equals(Object o) {
		Employee e = (Employee) o;
		return Objects.equals(employeeName, e.employeeName) && this.employeeId == e.employeeId;
	}

}
