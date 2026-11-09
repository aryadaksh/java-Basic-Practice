package com.week13.collectionsutility;

import java.util.Arrays;

/*
 * ListIterator is basically works on both side like backward and forward like hasPrevious and hasNext
 * 
 */

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
	
	public static void main(String[] args) {
		List<String> cities = new ArrayList<String>(Arrays.asList("Delhi","Gurgaon","Nodia"));
		
		ListIterator<String> listIterator = cities.listIterator();
		
		while(listIterator.hasNext()) 
		{
			String city = listIterator.next();
			
			if(city.equalsIgnoreCase("Gurgaon")) {
				if(listIterator.hasPrevious()) {
					String previousCity = listIterator.previous();
					System.out.println(previousCity);
					
				}
			}
			
			
		}
		
	}

}
