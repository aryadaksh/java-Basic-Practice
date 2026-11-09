package com.week.five;

public class User {

	private String userName,userId,mobile;
	public User(String _userName,String _userId, String _mobile) {
		this.mobile = _mobile;
		this.userId = _userId;
		this.userName = _userName;
		
	}
	public User(String userId) {
		this("GuestUsesr",userId,"Not Provided");
	}
}
