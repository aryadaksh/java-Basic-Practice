package com.week.eight;

public class Driver {

	public static void main(String[] args) {
		
		//PaymentSystem1 system = new PaymentSystem1(); 
		
		PaymentSystem1 system;
		 
		system = new UPIPayment();
		system.doTransaction();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		// PaymentSystem system = new PaymentSystem();
//		// we cannot create object class but
//		
//		PaymentSystem system = new HDFC();
//		// we can referner the abstract class and create the object of sub- class
//		system.doPayment();
//		system.suspendPayment();
//		system.stopPayment();
//		system.checkTransactionLimit();
//		system.checkStatus();
//		
//		// same for ICIC bank too
//		PaymentSystem system1 = new HDFC();
//		system1.doPayment();
//		system1.suspendPayment();
//		system1.stopPayment();
//		system1.checkTransactionLimit();
//		system1.checkStatus();
//	}
	
	
	
	
}
