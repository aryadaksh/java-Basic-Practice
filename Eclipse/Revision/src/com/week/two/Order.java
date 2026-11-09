package com.week.two;

public class Order {
	
	static String palceOrder(String itemName, int qty) {
		System.out.println("Placing order for the Item "+itemName);
		return "Order has been Placed, Your Order ID is kadh123 "+qty;
	}
	
	public static void main(String[] args) {
		String result = Order.palceOrder("Iphone",5);
		System.out.println(result);
	}

}
