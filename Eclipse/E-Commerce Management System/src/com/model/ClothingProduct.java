package com.model;

public class ClothingProduct extends Product
{
	
	private final static double GST_RATE = 4.99;
	
	public ClothingProduct(int _productId, String _productName, double _basePrice) {
		super(_productId, _productName, _basePrice);
		
	}

	@Override
	public double calculateFinalPrice() {
		
		return super.getBasePrice()+(GST_RATE/100*super.getBasePrice());
	}

}
