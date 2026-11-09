package com.week13.collectionsutility;

import java.util.Arrays;


/*
 *Fail safe -> snapshot iterator or weakly consistent iterator
 * -> iterator works over its own snapshot -> external modification don't trigger the same fail-fast check 
 */

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;

public class FailSafe {
	
	public static void main(String[] args) {
		
		List<String> list = new CopyOnWriteArrayList<String>(Arrays.asList("Delhi","Mumbai","Pune"));
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String value = iterator.next();
			
			list.remove(value); //  modifies the list , but the iterator works on OWN snapshot
			// No ConcurrentModificationException - iterator continues over its snapshot fines
		}
		
	}
	

}
