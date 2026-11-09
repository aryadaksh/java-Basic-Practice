package com.collectionsutility.methodexample;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Pandey");
		names.add("Raza");
		names.add("Arya");
		names.add("Suman");
		
		System.out.println("Before Sorting: "+names);
		
		Collections.sort(names);
		
		System.out.println("After Sorting: "+names);
		
		List<String> unmodifiable = Collections.unmodifiableList(names);
		
		//unmodifiable.add("Raj");
		
		// this made like sequencer 
		List<String> syncNames = Collections.synchronizedList(names);
		
		Collections.reverse(names);
		System.out.println("Revese order of names list: "+names);
		
		
	}
}
