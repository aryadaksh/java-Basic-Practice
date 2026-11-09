package com.week.ten;

public class InsufficientBalanceException extends Exception // RuntimeException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InsufficientBalanceException(String message) 
	{
		super(message);
	}
	

}
