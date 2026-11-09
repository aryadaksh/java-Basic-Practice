package com.listexample.arraylistexample.notes;

import java.util.List;
import java.util.ArrayList;


public class ArrayListExamples 
{

	public static void main(String[] args) 
	{
		List<String> products = new ArrayList<String>();
		products.add("Laptop");
		products.add("SmartPhone");
		products.add("Headphones");
		
		System.out.println("Electronic Products: "+products);
		
		System.out.println("First product: "+products.get(0));
		
		products.remove("Daksh");
		
		System.out.println("After removing SmartPhone: "+products);
		
		System.out.println("Total products: "+products.size());
		
		products.removeAll(products);
		System.out.println(products);
		products.remove("Daksh");
		
		
	}
}
