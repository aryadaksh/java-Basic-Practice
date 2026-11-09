package com.week.eight;

public abstract class PaymentSystem {

	public abstract void doPayment();
	public abstract void suspendPayment();
	public abstract void stopPayment();
	
	//NEW requirements added a year later
	public abstract void checkTransactionLimit();
	
	public void checkStatus() {
		System.out.println("Checkig Payment status");
	}
}
