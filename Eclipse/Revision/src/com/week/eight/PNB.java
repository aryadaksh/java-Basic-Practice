package com.week.eight;

public class PNB implements IBanking {

	@Override
	public void deposit(double amount) {
		System.out.println("PNB.deposit()");
		
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("PNB.withdraw()");
		
	}

	@Override
	public void checkBalance() {
		System.out.println("PNB.checkBalance()");
	}

	// dont need to implements if dont need it.                                                                                                                    
//	@Override
//	public void printPassbook() {
//		System.out.println();
//		
//	}

}
