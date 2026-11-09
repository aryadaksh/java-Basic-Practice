package com.week11;

import java.util.Set;
import java.util.HashSet;

public class Driver {
	
	public static void main(String[] args)
	{
		Set<String> cities = new HashSet<String>();
		
		cities.add("Patna");
		cities.add("Kolkata");
		cities.add("Jaipur");
		cities.add("Bangalore");
		cities.add("Mysore");
		cities.add("Chennai");
		cities.add("Patna");
		
		for(String city: cities) {
			System.out.println(city);
		}
	}

}
