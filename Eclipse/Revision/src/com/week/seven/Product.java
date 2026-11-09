package com.week.seven;

public class Product {

	public Product() {
		displayProduct();
	}
	public void displayProduct() {
		System.out.println("Generic method..");
	}
}

class ElectronicProduct extends Product{
	
	int x = 100;
	@Override
	public void displayProduct() {
		
		System.out.println(x+" ");
	}
}

class Main{
	public static void main(String[] args) {
		Product e = new ElectronicProduct();
		//ElectronicProduct em = (ElectronicProduct) e;
	}
}