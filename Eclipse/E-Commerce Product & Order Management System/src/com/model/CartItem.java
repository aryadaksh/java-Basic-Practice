package com.model;

public class CartItem {
	
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	
	public CartItem(int _productId, String _productName, double _price, int _quantity) {
		this.productId = _productId;
		this.productName = _productName;
		this.price = _price;
		this.quantity = _quantity;
	}
	
	

	public int getProductId() {
		
		return productId;
	}

	public int getQuantity() {
		
		return quantity;
	}
	
	public void setQuantity(int newQty) {
		this.quantity = newQty;
	}
	
	public double getTotalPrice() {
		return price*quantity;
	}
	
	@Override
	public String toString() {
	    return "\n🛒 Cart Item ---------------------------------\n" +
	           " Product Name   :: " + productName + "\n" +
	           " Quantity       :: " + quantity + "\n" +
	           " Unit Price     :: Rs." + price + "\n" +
	           " Total Price    :: Rs." + getTotalPrice() + "\n" +
	           "-----------------------------------------------";
	}

	

}
