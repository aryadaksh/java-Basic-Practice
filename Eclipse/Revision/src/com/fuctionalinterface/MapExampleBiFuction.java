package com.fuctionalinterface;

import java.util.HashMap;
import java.util.Map;

public class MapExampleBiFuction {

	public static void main(String[] args) {
		Map<String, Integer> salaries = new HashMap<>();
		salaries.put("John", 40000);
		salaries.put("Freedy", 30000);
		salaries.put("Samuel", 50000);
		
		System.out.println(salaries);
		
	//biFuction
		salaries.replaceAll((name,oldValue) -> 
		name.equals("Freddy") ? oldValue: oldValue+10000);
		
		System.out.println(salaries);
	}
}
