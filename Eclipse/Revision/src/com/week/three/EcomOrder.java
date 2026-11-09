package com.week.three;

public class EcomOrder {
	
	public static String getInvoice(String itemName) {
		System.out.println("Generating invoice for "+itemName);
		return "INVOIE123";
	}
	
	public static void sendOrderUpdateEmail(String itemName) {
		System.out.println("Sending order update email for "+itemName);
	}
	
	public  static void payForItem(String itemName) {
		System.out.println("Processing payment for "+itemName);
	}
	
	
	public static void placeOrder(String itemName) {
		System.out.println("Placing the order for "+itemName);
		
		String invoice = EcomOrder.getInvoice(itemName);
		System.out.println(invoice);
		
		EcomOrder.sendOrderUpdateEmail(itemName);
		EcomOrder.payForItem(itemName);
		
		
	}
	
	public static void main(String args[]) {
		
		String itemName = args[0];
		
		EcomOrder.placeOrder(itemName);
		
	}

}
