package com.mapexample.linkedhashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(20, "Aayush");
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(20, "Aayush");
		
		//map.compute((1, map1)  

		map.compute(20, (Integer,StringBuilder) -> ("Aayush" == "Aayush" ) ? "Ayush".concat("  rand") : "xyz" );
//		map.compute(key, (k, v) -> (v == null) ? msg : v.concat(msg))
		System.out.println(map.get(20));
	}
}
