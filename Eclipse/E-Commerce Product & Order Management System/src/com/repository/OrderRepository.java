package com.repository;

import java.util.ArrayList;
import java.util.List;

import com.model.Order;

public class OrderRepository {
	
	private List<Order> orders = new ArrayList<>();
	
	public void saveOrder(Order order) {
		orders.add(order);
	}
	
	public List<Order> getAllOrders(){
		return orders;
	}
	
	public List<Order> getOrderByCustomer(int customerId){
		List<Order> result = new ArrayList<>();
		for(Order o : orders) {
			if(o.getCustomerId() == customerId)
			{
				result.add(o);
			}
		}
		return result;
	}

}
