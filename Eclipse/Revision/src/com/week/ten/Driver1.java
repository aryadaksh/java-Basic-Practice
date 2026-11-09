package com.week.ten;

import java.io.ObjectInputStream;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Driver1 {
	
	//unchecked Exception
	
//	public static void main(String []args)
//	{
//		
////		String s = null;
////		System.out.println(s.charAt(0)); //NullPointerException
//		 
//	//	int a = 4/0; //ArithmeticException
//		
////		int[] arr = {12,12};
////		int value = arr[3]; //ArrayIndexOutOfBoundsException
//		
//		
//		
//	}
	
	public static void main(String[] args) {
//		 fis = null;
//		try {
//		FileInputStream fis = new FileInputStream("hello.daksh");
//		}catch(FileNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
//		try {
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		}catch(IOException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		finally {
//			fis.close();
//			ois.close();
//		}
		
		DynamicClassLoad dcl = new DynamicClassLoad();
		try {
		dcl.dynamicLoadClass();
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
