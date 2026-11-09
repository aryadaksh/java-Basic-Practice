package com.week.six.inheritance;

public abstract class Account {
	
	static {
		System.out.println("***********************WELCOME TO SBI****************************"); 
	}

	private int balance;
	private String accountHolderName, userId;
	
	public Account(int balance, String accountHolderName, String userId) {
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.userId = userId;
	}
	
	{
		System.out.println("***********************Hello****************************"); 
		System.out.println("Mr/Ms "+accountHolderName);
	}
	
	void openAccount() {
		System.out.println("Account Opened");
	}
	
	void approveAccount() {
		System.out.println("Account approved");
	}
	
	void closeAccount() {
		System.out.println("Account Closed");
	}
	
	void deposit(int amount) {
		if(amount > 0) {
			balance += amount;
		}
	}
	
	void withdrawl(int amount) {
		if(amount > 0 && amount <=balance) {
			balance -= amount;
		}
	}
	
	void userDetails() {
		System.out.println("Account Holder Name:  "+accountHolderName);
		System.out.println("User Id: "+userId);
	}
	
	int showBalance() {
		return balance;
	}
	
	
}
