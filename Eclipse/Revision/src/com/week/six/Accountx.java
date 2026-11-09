package com.week.six;

public class Accountx {

	private int balance;
	private String accountHolderName, userId;

	public Accountx(String _accountHolderName, String _userId, int _balance) {
		this.accountHolderName = _accountHolderName;
		this.userId = _userId;
		this.balance = _balance;
	}

	public Accountx() {
		accountHolderName = "John";
		userId = "john123";
		balance = 0;
	}

	public void updateDetails(String _accountHolderName, String _userId, int _balance) {
		this.accountHolderName = _accountHolderName;
		this.userId = _userId;
		if (_balance > 0) {
			this.balance = _balance;
		}

	}
	
	public void deposit(int amount) {
		if(amount>0) {
		balance += amount;
		}
	}
	
	public void withdraw(int amount) {
		if(amount <= balance && amount >0) {
			balance -= amount;
		}
		else {
			System.out.println("Insufficent Balance!!");
		}
	}

	
	public void showDetails() {
		System.out.println("Account Holder Name: "+accountHolderName+
							"\nUser Id: "+userId+
							"\nBalance: "+balance);
	}
	public int showBalance() {
		return balance;
	}
}
