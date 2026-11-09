package com.week.six;

public class Product {
	private String productId,productName;
	private int price;
	
	public Product(String _productId,String _productName,int _price) {
		this.price = _price;
		this.productId = _productId;
		this.productName = _productName;
	}
	public Product() {
		this("default_Id","Iphone",90000);
	}
	
	public void changeDetails(String _productId,String _productName, int _price) {
		this.price = _price;
		this.productId = _productId;
		this.productName = _productName;
	}
	
	public void printProductDetails() {
		System.out.println("Product Name: "+productName
							+"\nProduct Id:"+productId
							+"\nProduct Price:"+price);
	}
	
}
