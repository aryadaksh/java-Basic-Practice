package com.week.three;

public class IncomeCategory {
	
	private static void checkIncomeCategory(int yearlyIncome) {
		if(yearlyIncome < 200000) {
			System.out.println("Under Below Proverty Line");
		}
		else if(yearlyIncome >= 200000 && yearlyIncome < 1000000) {
			System.out.println("Category: Middle Class");
		}
		else if(yearlyIncome >= 1000000 && yearlyIncome < 10000000) {
			System.out.println("Category: Upper Middle Class");
		}
		else {
			System.out.println("Categogry : High Net Worth Individual");
		}
	}

	public static void main(String[] args) {
		int yearlyIncome = Integer.parseInt(args[0]);
		
		IncomeCategory.checkIncomeCategory(yearlyIncome);
	}
}
