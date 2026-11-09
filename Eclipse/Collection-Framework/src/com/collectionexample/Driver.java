package com.collectionexample;

import java.util.Map;
import java.util.HashMap;

public class Driver {
	
	public static void main(String[] args)
	{
		Map<Student,Double> studentDetails  = new HashMap<Student,Double>();
		
		studentDetails.put(new Student("Daksh Arya",324), 5678.00);
		studentDetails.put(new Student("Daiwik Arya",34), 423.00);
		studentDetails.put(new Student("Naveen Arya",79), 876543.00);
		studentDetails.put(new Student("Paju ",86), 87865.00);
		studentDetails.put(new Student("Masood Raza",908), 234.00);
		studentDetails.put(new Student("Suman",564), 92348.00);
		
		
		 
	}

}
