package com.mapexample.linkedhashmap;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;


public class MainApp {
	
	public static void main(String[] args) {
		
		Map<Student,Double> studentApp = new LinkedHashMap<Student,Double>();
		studentApp.put(new Student("Nitin Kumar",1),99.5);
		studentApp.put(new Student("Madhu Kumari",2),100.50);
		studentApp.put(new Student("Masood Raza",3), 110.50);
		
		studentApp.put(new Student("Nitin Kumar",1),100.0);
		
	//	System.out.println(studentApp);
		
		Set<Entry<Student,Double>> enterySet = studentApp.entrySet();
		
		Iterator<Entry<Student,Double>>itr = enterySet.iterator();
		

		while(itr.hasNext()) {
			Entry res = itr.next();
			System.out.println("Key:  "+res.getKey()+" value: "+res.getValue());
		}
		
	}

}
