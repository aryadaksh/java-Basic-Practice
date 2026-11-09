package com.week.eight;

public abstract  class PaymentSystem1 {

	public PaymentSystem1() {
		System.out.println("Print this is abstract class ");
	}
	
	public abstract void doTransaction(); // abstract method  - no Implementation
	
	public abstract void suspendTransaction(); // abstract method - no Implementation
	
	public void sendSMS() {
		System.out.println("Sending SMS Notification");
	}
	
	
	
}
