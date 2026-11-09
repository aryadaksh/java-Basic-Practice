package com.week.six;

public class Driver5 {

	public static void main(String[] args) {
		SavingAccount saving = new SavingAccount();
		saving.showDetails();
		System.out.println();
		saving.deposit(1000);
		System.out.println(saving.showBalance());
		System.out.println();
		saving.withdraw(500);
		System.out.println();
		saving.showBalance();
	}
}
