package com.week.two;

/*
 * Types of Operators
 * 1.Assignment Operator(=) -> set/assign a value to a variable. not Mathematical equality
 * 
 * 2. Relational Operators
 * 		>
 * 		<
 * 		==
 * 		!=
 * 		>=
 * 		<=
 * 
 * 3. Logical Operators
 * 	
 * 		&& (both should be true if first one is false it will not check second condition its will break -> Called Short Circuits)
 * 		|| (One should true then its will not check other its will break and return true its also shortCircuit)
 * 
 * 
 */

public class Operators {

	public static void main(String[] args) {
		int amount = 10; // this is 10 is assigned to amount (=) -> Operators used here is this
		
		if(amount >= 10) {
			System.out.println("The amount is Greater Than Or equal to 10");
		}
		else {
			System.out.println("Amount is less than 10");
		}
		
		// comparing the String using equals() not by ==
		System.out.println("Daksh".equals("Daksh"));
		System.out.println("Daksh".equals("daksh"));
		
		int amount1 = 100;
		boolean isEqual = (amount1 == 200);
		System.out.println(isEqual);
		
	}
}
