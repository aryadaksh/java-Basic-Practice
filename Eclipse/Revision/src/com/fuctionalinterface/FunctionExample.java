package com.fuctionalinterface;

import java.util.function.Function;

public class FunctionExample {
	
	public static void main(String[] args) {
		
//		Function<Integer, Integer> square = num -> num*num;
//		System.out.println(square.apply(6));
		
		Function<Double, Double> square = num -> num*num;
		Function<Double, Double> multipleByPI = num -> num*Math.PI;
		Function<Double, Double> findArea = multipleByPI.compose(square);
		System.out.println(findArea.apply(5.0));
		
	}
	

}
 