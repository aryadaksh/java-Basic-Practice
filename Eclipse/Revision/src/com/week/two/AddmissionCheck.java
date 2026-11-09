package com.week.two;

public class AddmissionCheck {
	
	public static void main(String [] args) {
		String state = args[0];
		int marks = Integer.parseInt(args[1]);
		
		if(marks >= 75 || state.equals("Bihar")) {
			System.out.println("You are Eligbale to Take addmission");
		}
		else {
			System.out.println("Not Allowed to take Addmission");
		}
		
		System.out.println("Marks: "+marks);
		System.out.println("State: "+state);
	}

}
