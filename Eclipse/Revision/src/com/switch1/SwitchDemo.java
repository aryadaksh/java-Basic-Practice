package com.switch1;

public class SwitchDemo {
	
	public static String identifyDay(int number) {
		
		String day = null;
		
		switch (number) {
		case 1:
			day = "Monday";
			break;

		default:
			day = "Invalid";
			break;
		}
		
		return day;
	}
	
	

	public static void main(String[] args) {
		

		System.out.println(identifyDay(1));
	}

}
