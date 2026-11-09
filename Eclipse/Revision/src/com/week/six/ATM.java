package com.week.six;

public class ATM {
	
	public static void main(String[] args) {
		AccountDetails account;
		account = new AccountDetails(10000,"Daksh Arya");
		
		account.withdraw(20000); // insufficent Balance
		account.withdraw(2000);
		System.out.println(account.checkBalance());
		
		account.deposit(300000);
		System.out.println(account.checkBalance());
	}

}
