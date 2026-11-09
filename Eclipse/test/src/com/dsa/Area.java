package com.dsa;

import java.util.Arrays;
import java.util.List;

public class Area {
	static int sum = sum1();
	static {
		System.out.println("Area.enclosing_method()");
	}
	
	static int sum1() {
		System.out.println(1+2) ;
		return 0;
	}
	
	//static int y = 10;
	/*
	 * static int sum = sum1();
	 */	
	public static void main(String[] args) {
		
		  List<Integer> input = Arrays.asList(1,8,6,2,5,4,8,3,7);
		  
		  int value = input.stream().distinct().sorted((a,b) ->
		  (b-a)).skip(1).findFirst().get();
		  
		  System.out.println(value*value);
		 
	}

}
