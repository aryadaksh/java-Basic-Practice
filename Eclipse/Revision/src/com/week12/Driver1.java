package com.week12;

import java.util.Set;
import java.util.HashSet;

public class Driver1 {
	
	public static void main(String[] args)
	{
		Set<String> set = new HashSet<String>();
		boolean r1 = set.add("A");
		boolean r2 = set.add("A");
		
		boolean r3 = set.contains("A");
		
		System.out.println(r1+" "+r2+ " "+r3);
		
	}

}
