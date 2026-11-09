package com.week.ten;

public class OrderService {

	public void palceOrder(String itemName,int quantity)
	{
		if(quantity <= 0) {
			throw new InvalidOrderQuatityException("Quatity must be Greater than zero");
		}
		
		System.out.println("Order Placed for " +quantity +" x "+itemName);
	}
	
	
}
