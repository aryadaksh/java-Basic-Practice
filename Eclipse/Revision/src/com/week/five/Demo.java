package com.week.five;

public class Demo {
	static {
		System.out.println("Static Block");
	}
	
	{
		System.out.println("Instance Block");
	}

	public Demo() {
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method Start");
		Demo d1 = new Demo();
		Demo d2 = new Demo();
	}
}
