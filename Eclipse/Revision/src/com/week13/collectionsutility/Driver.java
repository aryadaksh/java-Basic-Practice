package com.week13.collectionsutility;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Driver {

	public static void main(String[] args) {
		List<String> cities = new ArrayList<String>(Arrays.asList("Delhi", "Bangalore", "Ahmedabad"));

		Collections.sort(cities);

		System.out.println(cities); // -natural order (Alphabetical) order

		List<String> readOnlyCities = Collections.unmodifiableList(cities);

		//readOnlyCities.add("Kolkata"); // UnsupportedOperationException its will throw the exception cuz its become
										// only readOnly after implementing unmodifiableList() methods make its read
										// only

		List<String> safeList = new ArrayList<String>();
		// safeList is now thread-safe , but at the cost of reduced concurrency under heavy contention(Operations are serialized)
		
		//________________________________________________________________________________________________________
		// ConcurrentModificationException - the classic bug:
		List<String> list = new ArrayList<String>(Arrays.asList("Delhi","Mumbai","Pune"));
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			String city = itr.next();
			
			//list.remove(city); // structural modification during iteration -> BUG
		}
		
		//ConcurrentModificationException
		// this happens even in a single thread - no concurrency required
		
		//________________________________________________________________________________________________________
		//the Correct fix - iterator.remove():
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String city = iterator.next();
			if(city.equals("Mumbai")) 
			{
				iterator.remove();
			}
			
		}
		
		
	}

}
