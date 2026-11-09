package com.week.six;

public class Driver2 {
	
	public static void main(String[] args) {
		User user = new User();
		user.fullDetails();
		System.out.println();
		user.setDetails("Gold", "BSF");
		
		user.printDetails();
		System.out.println();
		user.setName("Daiwik Arya");
		user.fullDetails();
	}

}
