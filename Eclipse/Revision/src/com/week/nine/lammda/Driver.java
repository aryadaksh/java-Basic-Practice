package com.week.nine.lammda;

public class Driver {

	public static void main(String[] args) {
	ICalc calcu = (int a, int b) -> {
		int sum = a+b;
		return sum;
	};
	
	int value = calcu.cal(10, 4);
	System.out.println(value);
	
	}
	
}
