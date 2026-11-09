package com.week.eight;

public class BGB implements IBanking {

	@Override
	public void deposit(double amount) {
		System.out.println("BGB.deposit()");
		
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("BGB.withdraw()");
		
	}

	@Override
	public void checkBalance() {
		System.out.println("BGB.checkBalance()");
		
	}

	@Override
	public void printPassbook() {
		System.out.println("BGB.printPassbook()");
		
	}

}
