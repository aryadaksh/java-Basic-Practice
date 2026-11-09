package com.week.seven;

public class User {
	
	public static void main(String[] args) {
		PaymentProcessor processor = new PaymentProcessor();
		
		int balance = processor.checkBalance("User1", "Pass123"); 
		// processor.connectWithDB(); ->  its private so its its not accsiable
		
		// if connectWithDB(), validate(), getBalanceFromDB() where PUBLIC instead of private
		
		// another class could call them directly , skipping checkBalance() entirely
		
		// Later, if a new warning message is added ONLY  inside checkBalance():
		
	}

}
