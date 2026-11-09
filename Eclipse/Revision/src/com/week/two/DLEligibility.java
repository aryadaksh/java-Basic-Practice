package com.week.two;

public class DLEligibility {
	
	public static void main(String[] args) {
		int minAge = 18;
		int maxAge = 60;
		
		String ageStr = args[0];
		int applicationAge = Integer.parseInt(ageStr);
		
		if(applicationAge >= minAge && applicationAge <= maxAge) {
			System.out.println("Allowed to apply for DL");
			
		}
		else {
			System.out.println("You are not allowed to apply for DL, your age is "+applicationAge);
		}
	}

}
