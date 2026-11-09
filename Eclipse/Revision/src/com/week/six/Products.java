package com.week.six;

public class Products {
	private String productId,productName;
	private int price;
	
	public Products(String _productId,String _productName,int _price) {
		this.price = _price;
		this.productId = _productId;
		this.productName = _productName;
	}
	
	public Products() {
		this("Tc990890", "item", 1200);
	}
	
	public void changeProductDetails(String _productId,String _productName,int _price) {
		if(_price >0) {
		this.price = _price;}
		else {System.out.println("Invalid Price");}
		this.productId = _productId;
		this.productName = _productName;
	}
	
	public void printProductDetails(){
		System.out.println("Product Name:"+productId+
							"\nProduct Id:"+productId+
							"\nPrice"+price);	
	}

}
