package com.mapexample.treemap;

public class Order implements Comparable
{

	private String productName;
	private int price;
	
	public Order(String productName,int price) {
		this.productName = productName;
		this.price= price;
	}
	
//	public int compareTo(Object obj){
//		return this.productName.compareTo(((Order)obj).productName) & Integer.compare(((Order)obj).price,this.price);
//	}
	
	
	// Asecending order
//	public int compareTo(Object obj) {
//	return Integer.compare(this.price,((Order)obj).price);
//
//	}
	
	// Descending order
	public int compareTo(Object obj) {
		return Integer.compare(((Order)obj).price,this.price);

		}
	
	public String toString() {
		return productName+" "+price;
	}
	
	@Override
	public int hashCode() {
		return productName.hashCode();
		
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.productName.equals(((Order)obj).productName);
	}
	
}
