package com.week.nine;

public class Driver {
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Address address = new Address("Btm","India");
		Employee employee1 = new Employee("Daksh Arya", address);
		
		Employee employee2 = (Employee)employee1.clone();
		System.out.println(employee1.getDetails());
		System.out.println();
		employee2.address.setAddress("Bihar", "Bharat");
		System.out.println(employee2.getDetails());
		System.out.println();
		System.out.println(employee1.getDetails());
	}

}
