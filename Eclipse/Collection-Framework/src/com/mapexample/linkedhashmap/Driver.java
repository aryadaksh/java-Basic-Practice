package com.mapexample.linkedhashmap;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;

/*
 * LinkedHashMap store in unique + in insertion order
 */

public class Driver {
	
	public static void  main(String[] args) {
		
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer,String>();
		
		linkedHashMap.put(4, "Daksh Arya");
		linkedHashMap.put(5, "Daiwik Arya");
		linkedHashMap.put(8, "Raj Agrawal");
		
		// changing only value not key
		linkedHashMap.put(5, "Parveen Arya");
		
		//System.out.println(linkedHashMap);
		
		Set<Entry<Integer,String>> enterySet = linkedHashMap.entrySet();
		
		Iterator<Entry<Integer,String>> itr = enterySet.iterator();
		
		while(itr.hasNext()) {
			Entry res = itr.next();
			System.out.println("Key: "+res.getKey()+" Value: "+res.getValue());
			
		}
	}

}
