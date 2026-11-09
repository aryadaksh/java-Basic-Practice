package com.fuctionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConsumersExample {

	public static void main(String[] args) {
//		List<String> names = Arrays.asList("John","Freddy","Samuel");
//		names.forEach(name ->  System.out.println("Hello "+name));
		
		
		//System.out.println(names);
		
		List<String> names = Arrays.asList("Daksh","Daiwik", "Anglenga", "David");
		List<String> namesWithD = names.stream()
								.filter(name-> name.startsWith("D"))
								.collect(Collectors.toList());
		System.out.println(namesWithD);
	}
	
}
