package com.week.ten;

public class Account {
	
	private int balance;
	
	public Account(int balance)
	{
		this.balance = balance;
	}
	
	public void withdraw(int amount) throws InsufficientBalanceException
	{
		if(amount>balance) {
			throw new InsufficientBalanceException("Insufficient Balance to Withdraw "+amount);
		}
		balance -=amount;
		
		System.out.println("Withdrawal successful, remaining balance: "+balance);
	}

}
