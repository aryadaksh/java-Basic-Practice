package com.mapexample.treemap;

import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;

/*
 * In treeMap the order is unique and sorted
 * TreeMap get unique and sorted by Comparable interface in that one method is called compareTo
 */

public class Driver {

	public static void main(String[] args) {
		Map<String,String> treeMap = new TreeMap<String,String>();
		treeMap.put("Daksh", "Arya");
		treeMap.put("Daiwik", "Arya");
		treeMap.put("Parveen", "Patel");
		
		//changing the value of one of the key or updating it
		treeMap.put("Parveen", "Arya");
		
		Set<Entry<String,String>> enterySet = treeMap.entrySet(); 
		
		Iterator<Entry<String,String>> itr = enterySet.iterator();
		
		while(itr.hasNext()) {
			Entry res = itr.next();
			System.out.println("Key: "+res.getKey()+" Value: "+res.getValue());
		}
		
		//System.out.println(treeMap);
	}
}
