package com.week.eight;

public class HDFC extends PaymentSystem {

	public void doPayment() {
		System.out.println("HDFC.doPayment()");
	}

	public void suspendPayment() {
		System.out.println("HDFC.suspendPayment()");
		}
	
	public void stopPayment() {
		System.out.println("HDFC.stopPayment");
	}
	
	public void checkTransactionLimit() {
		System.out.println("HDFC.checkTransactionLimit");
	}

}
