package com.week.one2;

/*
 * Reading command Line Arguments
 */

 class AccountInfo {
	
	public static void main(String[] args) {
		String name = args[0];
		
		System.out.println("Name: "+name);
		
		System.out.println("Processing Payment");
	}

}
// for compilation 
// javac account.java

// for Execution
// java AccountInfo in com