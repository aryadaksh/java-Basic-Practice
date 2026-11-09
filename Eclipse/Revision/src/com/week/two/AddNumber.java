package com.week.two;

public class AddNumber {
	
	static int add(int firstNumber, int secondNumber) {
		return firstNumber+secondNumber;
	}

	public static void main(String[] args) {
		int input1 = Integer.parseInt(args[0]);
		int input2 = Integer.parseInt(args[1]);
		
		int result = AddNumber.add(input1,input2);
		System.out.println("Sum of "+input1+" + "+input2+" = "+result);
	}
}
