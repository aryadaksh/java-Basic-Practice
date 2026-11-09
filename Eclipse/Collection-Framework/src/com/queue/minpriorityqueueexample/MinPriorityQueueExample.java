package com.queue.minpriorityqueueexample;

import java.util.PriorityQueue;
import java.util.Queue;

public class MinPriorityQueueExample {

	public static void main(String[] args) {
		
		Queue<Integer> minPQ = new PriorityQueue<Integer>();
		
		minPQ.add(5);
		minPQ.add(2);
		minPQ.add(8);
		minPQ.add(1);
		
		System.out.println(minPQ);
		
	//	minPQ.forEach((Integer val) -> System.out.println(val));
		
		while(!minPQ.isEmpty() ) {
			int val = minPQ.poll();
			System.out.println(val);
		}
		
	}
}
