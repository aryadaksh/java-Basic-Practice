package com.week.two;

public class ProductTotal {
	
	static int gst = 18; // -same GST slab appliess to all products in this range
	
	public static void calculatePrice(String productName, int price) {
		int gstAmount = (price*gst)/100;
		int total = price + gstAmount;
		
		System.out.println("Product : "+productName);
		System.out.println("Total Price :"+total);
	}
	
	
	public static void main(String[] args) {
		String productName = args[0];
		int price = Integer.parseInt(args[1]);
		
		ProductTotal.calculatePrice(productName, price);
		
	}

}
