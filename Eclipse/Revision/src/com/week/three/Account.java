package com.week.three;

public class Account {

//	private static void accountInfo() 
//	 static void accountInfo() 
	protected static void accountInfo() 
	//public static void accountInfo() 

	{
		System.out.println("Displaying account Info");
	}

//	public static void main(String[] args) {
//		Account.accountInfo();
//	}

}

class AccountStatus {
	public static void main(String[] args) {
		Account.accountInfo();
		/*
		 * error: Main method not found in class com.week.three.Account, please define
		 * the main method as: public static void main(String[] args) or a JavaFX
		 * application class must extend javafx.application.Application
		 */
	}
}