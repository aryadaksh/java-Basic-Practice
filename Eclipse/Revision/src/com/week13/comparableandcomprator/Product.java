package com.week13.comparableandcomprator;

public class Product implements Comparable<Product>
{
	
	private int productId;
	private String productName;
	
	public Product(int productId,String productName)
	{
		this.productId = productId;
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public int compareTo(Product p) {
		int result = Integer.compare( p.getProductId(),this.productId);
		if(result == 0) {
			result = this.productName.compareTo(p.getProductName());
		}
		return result;
	}
}
