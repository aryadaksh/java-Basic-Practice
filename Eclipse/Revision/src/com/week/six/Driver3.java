package com.week.six;

public class Driver3 {
	
	public static void main(String[] args) {
		ElectronicProduct eP = new ElectronicProduct();
		eP.printProductDetails();
		System.out.println();
		eP.printFullDetails();
		System.out.println();
		eP.changeDetails("Txdsda", "S28", 1000000);
		eP.changeWarrenty(20);
		eP.printProductDetails();
		System.out.println();
		eP.printFullDetails();
	}

}
