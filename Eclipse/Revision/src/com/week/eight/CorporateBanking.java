package com.week.eight;

public class CorporateBanking implements IBankingSystem {
	
	@Override
	public void deposit(double amount) {
		System.out.println("The amount: "+amount);
		
	}
	
	@Override
	public void withdraw(double amount) {
		System.out.println("The Amount: "+amount);
	}
	
	@Override
	public void checkBalance() {
		System.out.println("THis is Ur balance");
	}
	
	@Override
	public void transferFunds(double amount, String toAccount) {
		System.out.println("THis is Amount:"+amount+" TO the Account: "+toAccount);
	}

}
