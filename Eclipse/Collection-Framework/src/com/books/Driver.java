package com.books;


import java.util.Arrays;
import java.util.List;

public class Driver {
	
	public static int sum(List<Integer> ints) {
		int s = 0;
		for(int n : ints) {
			s +=n;
		}
		return s;
	}
	
	public static void main(String[] args) {
		
		List<Integer> ints = Arrays.asList(1, 2, 3); /*
														 * int s = 0; for(int n : ints) {s += n;} assert s == 4;
					
														 *
														 */
		
		int value = Driver.sum(ints);
		 
		//System.out.println(s);
		
		/*
		 * List<Integer> ints = new ArrayList<Integer>(); ints.add(1); int n =
		 * ints.get(0); System.out.println(n );
		 */
		
		/*
		 * List<Integer> intss = new ArrayList<Integer>();
		 * intss.add(Integer.valueOf(1)); int value = intss.get(0).intValue();
		 */
	}

}
