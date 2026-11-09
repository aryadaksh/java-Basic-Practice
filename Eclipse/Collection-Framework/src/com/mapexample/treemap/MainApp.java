package com.mapexample.treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainApp {
	
	public static void main(String[] args) {
		
		Map<Order,Boolean> orderDetailsHashMap = new HashMap<Order,Boolean>();
		
//		Map<Order,Boolean> orderDetails = new TreeMap<Order,Boolean>();
		
		orderDetailsHashMap.put(new Order("Iphone17",2), true);
		orderDetailsHashMap.put(new Order("AppleMAc",6), true);
		orderDetailsHashMap.put(new Order("Samsumg26",10000000), false);
		orderDetailsHashMap.put(new Order("Samsumg26",100), true);
		
		orderDetailsHashMap.put(new Order("Iphone17",3), false);
		//Map<Order,Boolean> orderDetailsHashMap = new HashMap<Order,Boolean>(orderDetails);
		Map<Order,Boolean> orderDetails = new TreeMap<Order,Boolean>(orderDetailsHashMap);
		
		
		System.out.println(orderDetails);

	}

}
