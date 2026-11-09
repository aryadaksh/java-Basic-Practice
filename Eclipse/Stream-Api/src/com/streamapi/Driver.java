package com.streamapi;

import java.util.Arrays;
import java.util.List;

public class Driver {
	
	public static void main(String[] args)
	{ 
		List<String> cityName = Arrays.asList("Patna","Jaipur","Jodhpur","jadavpur");
		
		cityName.stream().filter(city -> city.length() > 6).map(city -> city.toUpperCase()).forEach(city -> System.out.println(city));
	}

}
