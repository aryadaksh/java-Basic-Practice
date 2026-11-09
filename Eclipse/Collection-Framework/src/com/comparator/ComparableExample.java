package com.comparator;

import java.util.Arrays;

public class ComparableExample {
	
	public static void main(String[] args) {
		
		Integer[] arr = {6,3,2,9,10,21};
		
//		Arrays.sort(arr /* ,(Integer val1 , Integer val2) -> val1 - val2 */ );
//		for(int val: arr) {
//			System.out.println(val);
//		}
		
		Arrays.sort(arr,(Integer val1, Integer val2) -> val2 - val1);
		
		for(int val: arr) {
			System.out.println(val);
		}
		
	}

}
