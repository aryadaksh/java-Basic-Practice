package com.week.six;

//import Com.accessmodifier.Account;

//class Account{
//	int balance;
//
//	public Account(int balance) {
//		this.balance = balance;
//	}
//
//	void showBalance() {
//		System.out.println("Balance:" + balance);
//	}
//	
//}

// this Account class is not well encapsulated for encapsulation we hide the data
// here balance should be private and for accessing value ore setting value of balance
// we use getter and setter method in ENCAPSULATION

class Account {
	private int balance;

	public Account(int balance) {
		this.balance = balance;
	}
	
	void Withdrawl(int amount) {
		System.out.println("Before Withdrawl Account Balance: "+balance);
		if(balance >= amount ) {
			balance -= amount;
		}
		else {
			System.out.println("Laadle Don't be OverSmart");
		}
		System.out.println("After Withdrawl Account Balance: "+balance);
	}

	void Deposit(int amount) {
		System.out.println("Before Withdrawl Account Balance: "+balance);
		if( amount > 0 ) {
			balance += amount;
		}
		System.out.println("After Withdrawl Account Balance: "+balance);
	}
	void ShowBalance() {
		System.out.println("Balance:" + balance);
	}

}


public class EncapsulationExample {
	
	public static void main(String[] args) {
//		Account account = new Account(1000);
//		account.showBalance();
//		account.balance=-123;
//		account.showBalance();
		
		Account account = new Account(1000);
		account.ShowBalance();
		account.Deposit(500);
		account.Withdrawl(1600);
		
		
	}

}
