package com.week.two;

public class OrderCharges {
	
	public static void main(String args[]) {
		String customerType = args[0];
		int price = Integer.parseInt(args[1]);
		
		int deliveryCharge = 0;
		int discount = 0;
		
		if(customerType.equals("premium") || price >= 5000) {
			deliveryCharge = 0;
			discount = (price*10)/100;
		}else {
			deliveryCharge = 30;
		}
		
		int totalCartValue = price-discount+deliveryCharge;
		
		System.out.println("Customer Type:"+customerType);
		System.out.println("Price: "+price);
		System.out.println("Delivery Charge:"+deliveryCharge);
		System.out.println("Discount: "+discount);
		System.out.println("Total Cart Value: "+totalCartValue);
	}

}
