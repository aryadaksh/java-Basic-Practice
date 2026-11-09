package com.week.ten;

public class Main {
	
	public static void main(String[] args) {
		Account account = new Account(1000);
		
		try {
		account.withdraw(1020);
		}
		catch(InsufficientBalanceException exceptionObject ) {
			System.out.println(exceptionObject.getMessage());
		}
		finally {
			account = null;
		}
	}

}
