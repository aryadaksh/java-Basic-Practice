package com.week.three;

public class PrintCities {
	
	private static void printAll(String[] input) {
		for(int index = 0; index< input.length; index++) {
			String city = input[index];
			System.out.println(city);
		}
	}

	public static void main(String[] args) {
		PrintCities.printAll(args);
	}
}
