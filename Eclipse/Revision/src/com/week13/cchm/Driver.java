package com.week13.cchm;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class Driver {

	public static void main(String[] args) {
		Map<String, Integer> productPrice = new HashMap<String, Integer>();
		productPrice.put("iPhone", 100000);
		productPrice.put("Samsung", 80000);
		productPrice.put("LG", 40000);

		// Imagine there is 10000 total products : read price

		// thread A customer buy Samsung
		productPrice.get("Samsung"); // reads 10000

		// thread B(Reseller), At the same time : updates price

		productPrice.put("Samsung", 90000);

		// Thread A might have already read the OLD price(80000) just before

		// the update completed -> customer sees stale/ Incorrect data

		// ________________________________________________________________________________________
		// We can fix the attempt 1 is using hashTable
		Hashtable<String, Integer> productPriceHashtable = new Hashtable<String, Integer>();
		productPriceHashtable.put("iPhone", 100000);
		productPriceHashtable.put("Samsung", 80000);
		productPriceHashtable.put("LG", 40000);

		// Every method is here is Synchronized by default-
		// Updating "iphone" locks reads/writes for All 10000 entries not just the
		// Samsung entry

		productPriceHashtable.get("Samsung"); // reads 10000

		productPriceHashtable.put("Samsung", 90000);// reads 10000

		// ________________________________________________________________________________________
		// We can fix the attempt 1b is using Collections.synchronizedMap()

		Map<String, Integer> productPriceSync = Collections.synchronizedMap(productPrice);
		//
		productPriceSync.get("Samsung");
		productPriceSync.put("Samsung", 90000);

		// same problem : the ENTIRE map object is locked during this operation

		// ________________________________________________________________________________________
		// Fix attempt2 - ConcurrentHashMap(Segement/bucket-level Locking)
		// till java 7 ConcurrentHashMap using bucket locking not locking whole just
		// lock the one bucket

		Map<String, Integer> productPriceCCHM = new ConcurrentHashMap<String, Integer>();
		productPriceCCHM.put("iPhone", 100000);
		productPriceCCHM.put("Samsung", 80000);
		productPriceCCHM.put("LG", 40000);

		productPriceCCHM.get("Samsung"); // reads 10000

		productPriceCCHM.put("Samsung", 90000);// reads 10000
		
		// till java 7 we have ConcurrentHashMap used to lock bucket or segement locking
		
		// ________________________________________________________________________________________
		// After java 7 ConcurrentHashMap introduced CAS mechanism i.e COMPARE AND SWEEP mechanism
		
		
		// Conceptual pseudo-logic showing what CAS does internally 
		
		
		/*
		 * boolean compareAndSwap(String key, int exceptedOldValue, int newValue) {
		 * synchronized (lockFreeMemoryLocation) { // atomic CPU-leve operation, not a
		 * // traditional lock
		 * 
		 * int currentValue = readCurrentValue(key); if(currentValue ==
		 * exceptedOldValue) { writeValue(key,newValue); return true; }
		 * 
		 * return false; // someone else changed it -> caller must retry
		 * 
		 * } }
		 */
		 
		
		// usage pattern (Conceptual):
		
		/*
		 * int oldPrice = productPriceCCHM.get("Samsung"); // read : 80000
		 * 
		 * boolean success = compareAndSweep("Samsung" , oldPrice, 95000); if(!success)
		 * { //someone else updated the price in the meantime(eg. tp 98000) // -> re-
		 * read the current value and retry the operation }
		 */
		

	}

}
