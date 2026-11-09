package com.week.eight;

public class UPIPayment extends PaymentSystem1 {
	
	public void doTransaction() {
		System.out.println("Doing upi Transaction");
	}
	
	public void suspendTransaction() {
		System.out.println("Suspending UPI Transaction");
	}

	// sendSMS(); -> inherited as-is - no need to reimplement
	
	
}
