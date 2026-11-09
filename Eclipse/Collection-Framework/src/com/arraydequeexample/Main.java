package com.arraydequeexample;

import java.util.ArrayDeque;

/*
 * ArrayDeque most of time is complexity is O(1)
 */

public class Main {

	public static void main(String[] args)
	{
		ArrayDeque<Integer> arrayDequeAsQueue = new ArrayDeque<>();
		//Insertion
		arrayDequeAsQueue.add(1);
		arrayDequeAsQueue.add(5);
		arrayDequeAsQueue.add(10);
		
		//Deletion
		int element = arrayDequeAsQueue.removeFirst();
		System.out.println(element);
		
		//Printing arrayDequeAsQueue
		System.out.println(arrayDequeAsQueue);
		
		
		//ArrayDequee as Stack LIFO
		ArrayDeque<Integer> arrayDequeAsStack = new ArrayDeque<>();
		arrayDequeAsStack.addFirst(1);
		arrayDequeAsStack.addFirst(5);
		arrayDequeAsStack.addFirst(10);
		
		int removeElement = arrayDequeAsStack.removeFirst();
		System.out.println(removeElement);
		
		
	}
}
