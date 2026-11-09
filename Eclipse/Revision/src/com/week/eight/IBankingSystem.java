package com.week.eight;

public interface IBankingSystem {

	int VALUE = 20; // i.e public static final int VALUE = 10;
	
	void deposit(double amount); // there is public abstract present
	
	void withdraw(double amount);
	
	void checkBalance();
	
	void transferFunds(double amount, String toAccount);
}
