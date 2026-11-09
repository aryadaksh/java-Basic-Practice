package com.model;

public abstract class Product {
	private int productId;
	private String productName;
	private String category;
	private double price;
	private int quantity;
	private String brand;

	public Product(int productId, String productName, String category, double price, int quantity, String brand) {
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		this.brand = brand;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}
	// Abstract method: Must be implemented by concrete product subclasses public
	// abstract double calculateFinalPrice();
	@Override public String toString() {
	return String.format("%s [ID=%d, Name='%s', Brand='%s', BasePrice=₹%.2f,
	 FinalPrice=₹%.2f, Stock=%d]", getClass().getSimpleName(), productId,
	 productName, brand, price, calculateFinalPrice(), quantity);
	}
	}
