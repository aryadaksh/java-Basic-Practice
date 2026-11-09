package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Order {

	private static final AtomicInteger UNIQUE_ID = new AtomicInteger(999999);
	
	private int orderId;
	private int customerId;
	private List<CartItem> items;
	private double totalAmount;
	private String orderStatus;
	private Date orderDate;
	
	//Constructors
	public Order(int customerId, List<CartItem> items) {
		
		this.orderId = UNIQUE_ID.incrementAndGet();
		this.customerId = customerId;
		this.items = new ArrayList<CartItem>(items);
		this.totalAmount = calculateTotal();
		this.orderStatus = "PLACED";
		this.orderDate = new Date();
	}

	private double calculateTotal() {
		
		return items.stream().mapToDouble(CartItem::getTotalPrice).sum();
	}

	// Getters
	public String getOrderStatus() {
		return orderStatus;
	}

	

	public int getOrderId() {
		return orderId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public List<CartItem> getItems() {
		return items;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public Date getOrderDate() {
		return orderDate;
	}
	
	
	//Setters
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	@Override
	public String toString() {
	    return "\n-----------------------------------------------------\n" +
	           "                 🧾 Order Summary                     \n" +
	           "-----------------------------------------------------\n" +
	           " Order ID       :: " + orderId + "\n" +
	           " Customer ID    :: " + customerId + "\n" +
	           " Status         :: " + orderStatus + "\n" +
	           " Date           :: " + orderDate + "\n" +
	           " Total Amount   :: Rs." + totalAmount + "\n" +
	           "-----------------------------------------------------\n";
	}

	
	
	
	
}
