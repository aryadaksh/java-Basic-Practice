package com.week.ten;

import java.io.IOException;

public class Driver2 {
	
	private String name;
	
	public Driver2() {
		this.name = null;
		
	}

	
	public Driver2(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}
	public int calcuateDivisor() {
		return 0;
	}
	
	public static void main(String[] args)
	{
		
		try {
		Driver2  d  = new Driver2();
		
		String userName = d.getName();
		//int result = 10/d.calcuateDivisor();
		
		String id = userName.substring(0,3)+"123";
		}catch(NullPointerException | ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
