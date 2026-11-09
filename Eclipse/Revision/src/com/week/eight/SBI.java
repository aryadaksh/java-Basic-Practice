package com.week.eight;

public class SBI implements IBanking {

	@Override
	public void deposit(double amount) {
		System.out.println("SBI.deposit()");
		
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("SBI.withdraw()");
		
	}

	@Override
	public void checkBalance() {
		System.out.println("SBI.checkBalance()");
		
	}

	// no need to implements if dont need it 
//	@Override
//	public void printPassbook() {
//		System.out.println();
//	}

}
