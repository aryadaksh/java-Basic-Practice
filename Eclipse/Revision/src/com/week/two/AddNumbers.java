package com.week.two;

public class AddNumbers {
	
	public static void main(String[] args) {
		
		String firstNumberStr = args[0];
		String secondNumberStr = args[1];
		
		int firstNumber = Integer.parseInt(firstNumberStr);
		int secondNumber = Integer.parseInt(secondNumberStr);
		
		int sum = firstNumber+secondNumber;
		System.out.println(" concanation ="+ firstNumberStr+secondNumberStr);
		System.out.println("Sum:"+sum);
		
		
	}
	
	
	// this is hard Code 
	/*
	public static void main(String[] args) {
		int sum = 5+20;
		System.out.println("Sum:"+sum);
	}

	*/
}
