package com.week.six.inheritance;

class EmployeeOverride{
	void printDetails() {
		System.out.println("Employee.printDetails()");
	}
	
}

class ManagerOverride extends EmployeeOverride{
	
	@Override
	void printDetails() {
		System.out.println("Manager.printDetails()");
	}
}

public class MethodOverriding {
	
	public static void main(String[] args) {
		EmployeeOverride employee;
		employee = new ManagerOverride();
		
		employee.printDetails();
		
	}

}
