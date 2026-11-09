package com.week.seven;

public class PaymentProcessor {

	public int checkBalance(String userId, String password) {
		connectWithDB();
		getUserAndPasswordFromDB();
		validate();
		int balance = getBalanceFromDB();
		
		return balance;
		
		
	}
	
	private void connectWithDB() {
		System.out.println("Connecting with DB");
	}
	
	private void getUserAndPasswordFromDB() {
		System.out.println("Fetching user/password from DB");
	}
	
	private boolean validate() {
		return true;
	}
	
	private int getBalanceFromDB() {
		return 1200;
	}
}
