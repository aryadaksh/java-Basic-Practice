package com.collectionsutility.methodexample;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample
{
	
	public static void main(String[] args) 
	{
		
		 List<Integer> values = new ArrayList<Integer>();
		 values.add(1000);
		 values.add(20);
		 values.add(400);
		 values.add(98);
		 
		 Iterator<Integer> itr = values.iterator();
		 while(itr.hasNext()) {
			 Integer val = itr.next();
			 System.out.println(val);
			 
			 if(val == 400) {
			 values.remove(400);
			 }
		 }
	}

}
