package com.week.two;

public class VariablesExample {
	
	static int interestRate = 5;

	int amount = 200; // instance variable - belongs to the object
	/*
	 * instance variable cannot be accessed directly from a static method
	 * without an object reference 
	 */
	
	public static void main(String[] args) {
		int balance = 200; // local Variable - scope limited to main()
		System.out.println("Balance: "+balance);
		System.out.println("Interest Rate: "+VariablesExample.interestRate);
		//Accessed using ClassName.variableName
		
		
		//calling static method name using ClassName.methodName()
		VariablesExample.view();
	}
	
	
	public static void view() {
		System.out.println("Rate: "+VariablesExample.interestRate);
		
		//System.out.println(balance); // Error :  Cannot find symbol - balance not visible here
	}
}
