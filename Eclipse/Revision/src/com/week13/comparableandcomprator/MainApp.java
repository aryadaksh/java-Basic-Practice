package com.week13.comparableandcomprator;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainApp {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(101, "Samsung TV"));
		products.add(new Product(103, "Router"));
		products.add(new Product(102,"Mouse"));
		products.add(new Product(102,"Wire-Less Mouse"));
		
		//Sort this list by Calling 
		Collections.sort(products, new ProductCompareByName());
	
		Iterator<Product> itr = products.iterator();
		while(itr.hasNext()) {
			Product pro = itr.next();
			System.out.println(pro.getProductId()+ " -->"+pro.getProductName());
		}
		
	}
}
