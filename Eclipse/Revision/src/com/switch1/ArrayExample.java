package com.switch1;

public class ArrayExample {

	private static void notifyCustomer(String phoneNumber, String email) {
		if(phoneNumber != null && !phoneNumber.isEmpty()) {
			System.out.println("Phone No: "+phoneNumber);
			return;
		}
		if(email != null && !email.isEmpty()) {
			System.out.println("Phone No: "+phoneNumber);
			return;
		}
		
		System.out.println("No contact Method Avaialbe");
	}
	
	public static void main(String[] args) {
		
		notifyCustomer("dfghjkl", "fdghjkl");
	}
}
