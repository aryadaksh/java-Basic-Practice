package com.week.three;

public class TravelDecision {
	
	private static void takeDecision(int amount) {
		if(amount >= 10000) {
			System.out.println("Go with Flight");
		}
		else if(amount <10000 && amount >= 5000) {
			System.out.println("Go with the Train");
		}
		else if(amount < 5000 &&  amount >=1000) {
			System.out.println("GO with the Bus");
		}
		else {
			System.out.println("Doesn't feeling well");
		}
	}
	
	public static void main(String args[]) {
		
		int amount = Integer.parseInt(args[0]);
		TravelDecision.takeDecision(amount);
	}

}
