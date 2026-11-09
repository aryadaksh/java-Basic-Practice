package com.week.nine.serlization;

import java.io.Serializable;

public class Employee implements Serializable
{

	private final static long serialVersionUID = 1l;

	private String name;
	private String empId;
	transient private int salary;

	public Employee(String name, String empId, int salary) {
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}

	public String getName() {
		return name;

	}

	public String getEmpId() {
		return empId;

	}

	public int getSalary() {
		return salary;

	}

}
