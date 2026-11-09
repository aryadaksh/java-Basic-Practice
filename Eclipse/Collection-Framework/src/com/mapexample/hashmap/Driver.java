package com.mapexample.hashmap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;

import java.util.Iterator;


public class Driver {

	public static void main(String[] args) {
		Map<String,String> hashMap = new HashMap<String, String>();
		hashMap.put("Bihar", "Patna");
		hashMap.put("Jharkhand", "Ranchi");
		hashMap.put("West Bengal", "Kolkata");
		hashMap.put("Punjab", "Chandigarh");
		hashMap.put("Haryana", "Candigarh");
		
		// adding same key just changing the value or updating the value
		hashMap.put("West Bengal", "KOL");
		
		//System.out.println(hashMap);
		
		// for doing iteration we need to convert map into set cuz map doesn't extends to iterable
		Set<Entry<String,String>> entrySet = hashMap.entrySet();
		
		Iterator<Entry<String,String>> itr = entrySet.iterator();
		
		while(itr.hasNext()) {
			Entry res= itr.next();
			System.out.println("Key: "+res.getKey()+" Value:"+res.getValue());
		}
		
	}
}
