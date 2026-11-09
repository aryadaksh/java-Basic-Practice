package com.week.six;

public class AccountDetails {
	
	private int balance;
	private String name;
	
	public AccountDetails(int balance,String name) {
		this.balance = balance;
		this.name = name;
	}
	
	public void deposit(int amount) {
		if(amount> 0) {
			balance += amount;
		}
	}
	
	public void withdraw(int amount) {
		if (amount <= balance) {
			balance -= amount;
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	
	public int checkBalance() {
		return balance;
	}

}
