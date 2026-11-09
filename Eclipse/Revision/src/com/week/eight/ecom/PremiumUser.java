package com.week.eight.ecom;

public class PremiumUser  extends  OrderManagement{

	@Override
	public void palceOrder() {
		System.out.println("Premium user placing order with priority");
	}
	
	@Override
	public void editOrder() {
		System.out.println("Premium user editing order");
	}
	
	@Override
	public void confirmOrder() {
		System.out.println("Premium user confirming order with instant confirmation");
	}
	
}
