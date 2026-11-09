package com.switch1;


class SBIUser{
	
	private String name;
	private String userId;
	private String password;
	private int balance;
	
	public SBIUser() {
		System.out.println("Constructor called , new Object is Created");
	}
	
	public SBIUser(String _name, String _userId, String _password, int _balance) {
		System.out.println("Premetersized Constructor called , new Object is Created");
	}
	
	
}


public class ObjctExample {

	public static void main(String[] args) {
		SBIUser user1 = new SBIUser();
		SBIUser user2 = new SBIUser(null, null, null, 0);
	}
}
