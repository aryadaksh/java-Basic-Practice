package com.week.ten;

public class UserHelp {
	
	public String generateUserId(String userName)
	{
		String userId = null;
		try {
		userId = userName.substring(0,3)+"323";
		}
		catch(NullPointerException e) {
			System.out.println("User Name is not provided");
		}
		return userId;
		
	}
	
	
	public static void main(String[] args) {
		UserHelp userHelp = new UserHelp();
		String user = userHelp.generateUserId("Ghih");
		System.out.println("User Id: "+user);
	}

}
