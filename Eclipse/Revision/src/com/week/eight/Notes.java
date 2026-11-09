package com.week.eight;

/*
 * why force a Contract ?
 * reason 1: Preventing Naming Chaos
 * reason 2: Centralized Control for Future charges
 * pre - java 8-> 100% conatct , No common Functionality
 * 
 * 
 */

interface IBankingp{
	int P  =1; // public static final 
	void deposit(double amount); // public abstract 
	abstract  void withdraw(double amount);
	
	public abstract void checkBalance();
}

public class Notes {

}
