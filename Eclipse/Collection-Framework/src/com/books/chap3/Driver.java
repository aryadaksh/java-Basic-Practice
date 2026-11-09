package com.books.chap3;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Driver {
	
	public static <T extends Comparable<T>> T max(Collection<T> coll)
	{
		T candidate = coll.iterator().next();
		for(T elt : coll)
		{
			if(candidate.compareTo(elt)< 0)candidate = elt;
		}
		return candidate;
	}

	public static void main(String[] args) {
		
		List<Integer> ints = Arrays.asList(0,1,2);
		System.out.println(max(ints));
		
		List<String> str = Arrays.asList("Zero","One","Two");
		System.out.println(max(str));
		
		List<Number> nums = Arrays.asList(1,2,3.14);
	//	max(nums); //The method max(Collection<T>) in the type Driver is not applicable for the arguments (List<Number>)
		
	}
}
