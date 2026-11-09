package com.week.five;

public class StringExample2 {

	public static void main(String[] args) {
		String a = "Hello "+"Java"; // complie time its will make one object
		String b = a +" Daksh"; // runtime its will happen
		
		String s1 = new String("Hello");
		String s2 = "Hello";
		
		System.out.println(s1 == s2); //false
		System.out.println(s1.intern() == s2); //true
		
		System.out.println("Value: "+50+"Daksh");
		System.out.println(50+60+"Daksh");
		String name = null;
		System.out.println("Daksh"+name);
	}
}
