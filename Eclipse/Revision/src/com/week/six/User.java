package com.week.six;

public class User extends UserManagement {

	private String name;
	
	public User(String _type,String _location,String _name) {
		super(_type,_location);
		this.name = _name;
	}
	
	public User(String _name) {
		this.name = _name;
	}
	
	public User() {
		
	}
	public void fullDetails() {
		System.out.println("Name: "+name);
		super.printDetails();
	}
	
	public void setName(String _name) {
		this.name = _name;
		
	}
}
