package com.week.eight.ecom;

public abstract  class OrderManagement {

	
	public abstract  void palceOrder();
	public  abstract void editOrder();
	public abstract void confirmOrder();
	
	public void getOrderStatus() {
		System.out.println("Fetching order Status");
	}
}
