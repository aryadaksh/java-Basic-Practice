package com.books.chap2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Driver {
	
	//THis is to get in the wildcard
	public static double sum(Collection<? extends Number>nums)
	{
		double s = 0.0;
		for(Number num : nums) s += num.doubleValue();
		return s;
	}
	
	
	// this is to put in super wildcard
	public static void count(Collection<? super Integer> ints, int n )
	{
		for(int i = 0; i<n; i++) ints.add(i);
	}
	
	
	public static void main(String[] args) {
		/*
		 * List<Integer> ints = new ArrayList<>(); ints.add(1); ints.add(2);
		 * 
		 * List<Number> nums = ints; //ype mismatch: cannot convert from List<Integer>
		 * to List<Number>
		 * 
		 * nums.add(3.14); assert ints.toString("[1,2,3.14]"); //The method toString()
		 * in the type Object is not applicable for the arguments (String)
		 */

		// List<Number> ints = new ArrayList<>(); ints.add(1.2); ints.add(2.3);

		// List<Double> doubleInts = ints; //Type mismatch: cannot convert from
		// List<Number> to List<Double>

		List<Number> nums = new ArrayList<>();
		List<Integer> ints = Arrays.asList(1, 2);
		List<Double> dbls = Arrays.asList(2.78, 3.14);
		nums.addAll(dbls);
		nums.addAll(ints);
		//System.out.println(nums);

		List<Integer> ints1 = new ArrayList<>();
		ints1.add(1);
		ints1.add(2);

		List<? extends Number> nums1 = ints;
		//nums1.add(3.14); // The method add(capture#1-of ? extends Number) in the type List<capture#1-of ?
							// extends Number> is not applicable for the arguments (double)

		/*
		 * System.out.println(sum(ints)); System.out.println(sum(dbls));
		 * 
		 * List<Number> num = Arrays.asList(1,2,2.78, 3.14);
		 * 
		 * System.out.println(sum(num));
		 */
		
		List<Integer> cValue = new ArrayList<>();
		count(cValue, 5);
	}

}
