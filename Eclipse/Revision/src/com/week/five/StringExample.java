package com.week.five;

public class StringExample {

	public static void main(String[] args) {
		String city = "Bangalore"; // -> literal - created in SCP (1st Object)
		String india = "India"; // -> literal - Created in SCP (2nd Object)
		//String c = "Bangalore";// same content - reuses existing object , no new object created
		String c = "bangalore";
		c.concat(" Btm");
		
		System.out.println(c);
		
		//System.out.println(city == c);
		
		
		String s1 = new String("Bangalore");
		
		String s10 = "Mumbai";
		String s11 = "Mumbai";
		
		System.out.println(s10 = s11); // true
		
		String s13 = new String("Mumbai");
		String s14 = new String("Mumbai");
		
		System.out.println(s13 == s14); // false
		
		
		String city1 = "Bangalore";
		city1 = city1.concat(" India"); // new object Bangalore India in the heap
		
		System.out.println(city1);
		
		String city2 = "Delhi";
		city2.concat(" India");
		System.out.println(city2);
		
	}
}
