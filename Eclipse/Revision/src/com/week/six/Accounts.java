package com.week.six;

public class Accounts {

//	public int balance;
	
	private int balance;
	
	public Accounts(int _balance) {
		this.balance = _balance;
	}
	
	public void setBalance(int _balance) {
		if(_balance > 0) {
		this.balance = _balance;}
		else {
			balance = balance;
		}
	}
	public int getBalance() {
		return balance;
	}
	
	
	
}

class user{
	public static void main(String[] args) {
		Accounts acc = new Accounts(0);
		//acc.balance = 100;
		// acc.balance = -100;
		
		acc.setBalance(100);
		System.out.println("Balance: "
		
				+acc.getBalance());
		acc.setBalance(-100);
		System.out.println("Balance: "+acc.getBalance());
	}
}
