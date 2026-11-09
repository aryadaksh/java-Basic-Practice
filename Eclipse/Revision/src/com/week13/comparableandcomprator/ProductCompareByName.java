package com.week13.comparableandcomprator;

import java.util.Comparator;

public class ProductCompareByName implements Comparator<Product>
{
	public int compare(Product p1,Product p2) {
		
		int result = p1.getProductName().compareTo(p2.getProductName());
		
		if(result == 0) {
			result = Integer.compare(p2.getProductId(),p1.getProductId());
		}
		
		return result;
	}
	

}
