package com.week.seven;

public class Employee {
	

}

class Manager extends Employee{
	
}

class Driver{
	public static void main(String[] args) {
//		Employee e  = new Manager();
		// Auto upcasting - > automatically
		Employee e  = (Employee)new Manager();
		
		//downcasting 
		Manager m = (Manager) new Employee(); // explict downcasting  but its will give classCastException
		Manager m1 = (Manager) e;
	}
}