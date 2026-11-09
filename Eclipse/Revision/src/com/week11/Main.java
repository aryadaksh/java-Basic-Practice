package com.week11;

class Person{
	
}

public class Main {
	
	public static void main(String[] args)
	{
		Person p1 = new Person();
		Person p2 = new Person();
		
		int value1 = p1.hashCode(); //JVM assign some random numbers
		int value2 = p2.hashCode(); // a different number for different object
		
		System.out.println(value1+" "+value2); 
		
		String s1 = "Value";
		String s2 = "Value";
		
		
		int valueStr1 = s1.hashCode(); //String already Override this hashcode so the value will come same
		int valueStr2 = s2.hashCode();
		
		System.out.println(valueStr1+" "+valueStr2);
		
		String sNew1 = new String( "Value");
		String sNew2 = new String("Value");
		
		int valueNewStr1 = sNew1.hashCode(); //String already Override this hashcode so the value will come same
		int valueNewStr2 = sNew2.hashCode();
		
		System.out.println(valueNewStr1+" "+valueNewStr2);
	}

}
