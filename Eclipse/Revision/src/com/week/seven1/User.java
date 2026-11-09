package com.week.seven1;

public class User {

	public static void main(String[] args) {
		PaymentProcessor p  = new PaymentProcessor();
		//System.out.println(p.getBalanceFromDB());
		//Know its well Abstracted 
		
		System.out.println(p.checkBalance("daiwik21", "Test@123"));
	}
}
