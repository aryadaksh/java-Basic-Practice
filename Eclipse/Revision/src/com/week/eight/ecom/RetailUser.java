package com.week.eight.ecom;

public class RetailUser extends OrderManagement {
	
	@Override
	public void palceOrder() {
		System.out.println("Retails user placing order");
		
	}
	
	@Override
	public void editOrder() {
		System.out.println("Retail user editing order");
		
	}
	
	@Override
	public void confirmOrder() {
		System.out.println("Retail user confirming order");
	}

}
