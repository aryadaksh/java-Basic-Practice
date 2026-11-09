package com.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Product {
	
	private static final AtomicInteger UNIQUE_ID = new AtomicInteger(999);
	
	private int productId;
	private String productName;
	private String category;
	private int quantity;
	private String brandName;
	private double price;
	
	
	
	public Product(String productName,double price, String category, int quantity, String brandName) {
		this.productId =UNIQUE_ID.incrementAndGet();
		this.price = price;
		this.productName = productName;
		this.category = category;
		this.quantity = quantity;
		this.brandName = brandName;
	}
	
	
	// Getters
	public int getProductId() {
		return productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public String getCategory() {
		return category;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public String getBrandName() {
		return brandName;
	}
	
	public double getPrice() {
		return price;
	}
	
	// Setters
	
	public void setPrice(double price) {
		this.price = price;
	}
	

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public void setQuantity(int newQty) {
		this.quantity = newQty;
		
	}
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	
	// Overriding toString
	@Override
	public String toString() {
	    return "═════════════════════════════════════════════════════\n" +
	           "║                 Product Details                     ║\n" +
	           "═════════════════════════════════════════════════════\n" +
	           "║ Product Id    :: " + productId + "\n" +
	           "║ Product Name  :: " + productName + "\n" +
	           "║ Price         :: Rs." + price + "\n" +
	           "║ Quantity      :: " + quantity + "\n" +
	           "║ Category      :: " + category + "\n" +
	           "║ Brand Name    :: " + brandName + "\n" +
	           "═════════════════════════════════════════════════════";
	}



	
	

}
