package com.comparatorandcomparable;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Driver {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(32,"Iphone 17 pro Max"));
		products.add(new Product(32221,"TATA STEEL TNT"));
		products.add(new Product(2425422,"Godgrej Lock"));
		products.add(new Product(54217623,"LG AC"));
		products.add(new Product(764567,"Samsung Washing Machine"));
		
		Collections.sort(products);
		
		
		for(Product p : products) {
			System.out.println(p.productId+" "+p.productName);
		}
		
		
		
	}
}
