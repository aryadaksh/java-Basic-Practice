package com.week.four;

public class DiscountCalcuator {
	
	static void calculateDiscount(String type) {
		switch (type) {
		case "Silver":
			System.out.println("No Discount");
			break;
		case "Gold":
			System.out.println("U can Get Whole Shop for Free");
			break;
		default:
			System.out.println("Gareeb!");
			break;
		}
	}

}
