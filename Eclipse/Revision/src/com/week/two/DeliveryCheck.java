package com.week.two;

public class DeliveryCheck {

	public static void main(String[] args) {
		int orderValue = Integer.parseInt(args[0]);
		
		if(orderValue >= 450) {
			System.out.println("Free Delivery");
		}
		else {
			System.out.println("Delivery Charges applicable");
		}
	}
}
