package com.accessmodifier;



public class Account {

	private static void accountInfo() {
		System.out.println("Displaying Account Info");
	}
	
	
	public static void main(String[] args) {
		
		Account.accountInfo();
	}
}

class AccountInfo {
	
	public static void main(String[] args) {
		//Account.accountInfo(); // Error : accountInfo() has Private access in Account class
	}
}