package com.week.ten;



public class CheckPresent {
	
	public static void main(String[] args) 
	{
		UserService userService = new UserService();
		
		try {
		userService.createUser("Daksh123");
		}
		catch(UserAlreadyExistsException exceptionObject) {
			System.out.println(exceptionObject.getMessage());
		}
		
		finally {
			userService = null;
		}
	}

}
