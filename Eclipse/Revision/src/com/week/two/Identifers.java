package com.week.two;

public class Identifers {
	
	/*
	 * _/$(A-Z)/(a-z)after(0-9)
	 */
	
	/* resverd Keywords
	 *  like class if else int float
	 *  
	 */

}

class DataProcessor{
	public static void main(String[] args) {
		//String fileName= "data_08_june.xls"; // its is Hardcode its should not be hardcoded
		
		String fileName = args[0];
		
		System.out.println("File Name:"+fileName);
	}
}
