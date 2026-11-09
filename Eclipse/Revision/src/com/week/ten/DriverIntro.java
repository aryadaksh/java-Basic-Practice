package com.week.ten;

public class DriverIntro {

	void nullPointerExceptionHandle() {
		System.out.println("method Started");

		String name = null;
		try {
			int length = name.length();
			System.out.println("Length: " + length);
		} catch (NullPointerException e) {
			System.out.println("name is null");
		}

		System.out.println("method Ended");

	}

	void arrayIndexOutOfBoundExceptionHandle(String[] args) {
		try {
			String name = args[0];

			System.out.println(name);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please provide a valid Array");
		}
	}

	void arithmeticExceptionHandle() {
		int a = 10, b = 0;
		try {
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Don't divided by Zero");
		}
		
	}
	
	

	public static void main(String[] args) {
		System.out.println("Main Start ");

//		String name = null;
//		int length = name.length();
//		System.out.println("Length: "+length);
//		

//		String name = args[0];
//		System.out.println(name);

//		int a = 10, b= 0;
//		int c = a/b;
//		System.out.println(c);

		System.out.println("Main End");

	}
}
