package com.model;

public class ElectronicsProduct extends Product {
	private int warrantyMonths;

	public ElectronicsProduct(int productId, String productName, double price, int quantity, String brand,
			int warrantyMonths) {
		super(productId, productName, "Electronics", price, quantity, brand);
		this.warrantyMonths = warrantyMonths;
	}

	public int getWarrantyMonths() { return warrantyMonths; }

@Override
public double calculateFinalPrice() { return getPrice() \* 1.18; // Applies 18% GST for electronics } }
