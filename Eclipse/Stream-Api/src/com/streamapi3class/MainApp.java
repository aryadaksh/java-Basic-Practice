package com.streamapi3class;

import java.util.*;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public double getSalary() {
    	return salary;
    }

   
    
   
}


public class MainApp {
	public static void main(String[] args) {
		
	
	List<Employee> employees = Arrays.asList(
            new Employee("Daksh", 12000),
            new Employee("Amit", 15000),
            new Employee("Riya", 12000),
            new Employee("Karan", 18000),
            new Employee("Sneha", 15000),
            new Employee("Vikas", 20000),
            new Employee("Meera", 12000),
            new Employee("Arjun", 18000),
            new Employee("Neha", 15000),
            new Employee("Rohan", 20000),
            new Employee("Priya", 12000),
            new Employee("Suresh", 15000),
            new Employee("Anita", 18000),
            new Employee("Manish", 20000),
            new Employee("Pooja", 12000),
            new Employee("Rahul", 15000),
            new Employee("Komal", 18000),
            new Employee("Deepak", 20000),
            new Employee("Shivani", 12000),
            new Employee("Varun", 15000)
        );

	Employee result = employees.stream().distinct().sorted((e1,e2) -> Double.compare(e2.salary, e1.salary)).skip(1).findFirst().get();
	System.out.println(result.name+" "+result.getSalary());
	}
}
