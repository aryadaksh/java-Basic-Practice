package com.week.eight;

public class PersonalBanking  implements IBankingSystem{

	@Override
	public void deposit(double amount) {
		System.out.println("Amount: "+amount);
	}
	
	@Override
	public void withdraw(double amount) {
		System.out.println("Amount: "+amount);
	}
	
	@Override
	public void checkBalance() {
		System.out.println("THis is Ur balance");
	}
	
	@Override
	public void transferFunds(double amount , String toAccount) {
		System.out.println("Amount : "+amount+" TO Account: +"+toAccount);
	}
	
}
