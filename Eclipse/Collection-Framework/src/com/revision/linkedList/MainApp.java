package com.revision.linkedList;

import java.util.Collections;
//import java.util.List;
import java.util.LinkedList;

public class MainApp {
	
	public static void main(String[] args) {
		LinkedList<Integer> list  = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.addFirst(3);
		list.addLast(4);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
		System.out.println(list.peek());
		System.out.println(list.poll());
		
		System.out.println(list.offer(19));
		System.out.println(list);
		
		//Collections.sort(list);
		
		
		
		
	}

}
