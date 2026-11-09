package com.week13.hashMap;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Driver {
	
	public static void main(String[] args) 
	{
		Map<Integer,String> studentDetails = new HashMap<Integer,String>(); 
		//studentDetails.put(23, "Daksh Arya");
		studentDetails.put(25, "Suman");
		studentDetails.put(7, "Masood Raza");
		studentDetails.put(23, "Daksh Arya");
		
		System.out.println(studentDetails.put(23, "Daiwik Arya"));
		
//		Set<Entry<Integer,String>> entrySet = studentDetails.entrySet();
//		Iterator<Entry<Integer,String>> itr = entrySet.iterator();
//		
//		while(itr.hasNext()) {
//			Entry e = itr.next();
//			System.out.println("Key: "+e.getKey()+ "--> "+e.getValue());
//		}
		
		Collections.sort((List<Integer>) studentDetails , (s1,s2)-> Integer.compare(s2, s1));
		
		System.out.println(studentDetails);
		
		
	}

}
