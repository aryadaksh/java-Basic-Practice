package com.week.nine.deepcloning;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("Btm 1st 9th Cross", "Bengalure");

		Employee employee1 = new Employee("Daksh Arya", address);

		System.out.println(employee1.getDetails());

		System.out.println();

		Employee employee2 = (Employee) employee1.clone();
		System.out.println(employee2.getDetails());

		System.out.println();
		employee2.setDetails("Daksh Arya", "Bihar", "India");
		System.out.println(employee2.getDetails());

		System.out.println();
		
		System.out.println(employee1.getDetails());

		System.out.println();
	}

}
