package com.week.ten;

public class UserService 
{
	private boolean checkIfExcits(String userId) {
		return "Daksh123".equals(userId);
	}
	
	public void createUser(String userId) throws UserAlreadyExistsException 
	{
		boolean exists = checkIfExcits(userId);
		
		if(exists) {
			throw new UserAlreadyExistsException("User Id "+userId+" already Exists");
		}
		
		System.out.println("User Created "+userId);
		
	}
}
