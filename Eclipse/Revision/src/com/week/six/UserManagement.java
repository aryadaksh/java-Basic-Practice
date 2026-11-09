package com.week.six;

public class UserManagement {

	private String type,location;
	
	public UserManagement(String type,String location) {
		this.location = location;
		this.type = type;
	}
	
	public UserManagement() {
		this("default","BLR");
	}
	
	public void printDetails() {
		System.out.println("Type:"+type);
		System.out.println("Location:"+location);
		
	}
	
	public void setDetails(String _type,String _location) {
		this.type = _type;
		this.location = _location;
	}
	
}
