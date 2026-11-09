package com.week.seven1;

public class PaymentProcessor {
	//public void connectWithDB() 
	private void connectWithDB() 
	{
		System.out.println("Hand Shake with DB");
	}
	
	//public void getUserAndPasswordFromDB() 
	private void getUserAndPasswordFromDB()
	{
		System.out.println("HandShake getUser And  Password From DB()");
	}

	//public boolean validate() 
	private boolean validate()
	{
		return true;
	}
	
	//public int getBalanceFromDB() 
	private int getBalanceFromDB() 
	{
		return 1200;
	}
	public int checkBalance(String userId, String password) {
		connectWithDB();
		getUserAndPasswordFromDB();
		validate();
		int balance = getBalanceFromDB();
		return balance;
	}
}
