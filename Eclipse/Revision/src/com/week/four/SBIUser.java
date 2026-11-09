package com.week.four;

public class SBIUser {
	
	private String name,userId,password;
	private int balance;
	
	public SBIUser() {
		System.out.println("Constructor called, new object created");
	}
	
	public SBIUser(String _name,String _userId,String _password,int _balance) {
		this.balance = _balance;
		this.name = _name;
		this.userId = _userId;
		this.password = _password;
	}
	
//	public static void main(String[] args) {
//		SBIUser sbiUser                    = new SBIUser(); //-> its create object and call constructor
//	//	type    reference variable name      this actual Creta an Object
//	
//		//If there is no Constructor then its will Explicity make a default construcutor and make it call 
//	}

}
