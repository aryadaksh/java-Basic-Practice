package com.week.three;

public class ControlFlow {

	public static boolean checkFreeDelivery(int amount) {
		boolean status = false;
		
		if(amount >= 10000) {
			//System.out.println("Free Delivery");
			status = true;
		}
		else {
			status = false;
		}
		return status;
	}
	
	public static void main(String[] args) {
		int amount = Integer.parseInt(args[0]);
		
		boolean result = ControlFlow.checkFreeDelivery(amount);
		System.out.println("Customer delivery status: "+result);
		
	}
}
