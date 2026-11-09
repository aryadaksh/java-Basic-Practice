package com.queue.maxpriorityqueueexample;

import java.util.PriorityQueue;
import java.util.Queue;

public class MaxPriorityQueueExample {

	public static void main(String[] args) {
		
		Queue<Integer> maxPQ = new PriorityQueue<>((Integer a,Integer b) -> (b-a));
		
		maxPQ.add(5);
		maxPQ.add(2);
		maxPQ.add(8);
		maxPQ.add(1);
		
		//maxPQ.forEach((Integer val ) -> System.out.println(val));
	
		while(!maxPQ.isEmpty()) {
			int val = maxPQ.poll();
			System.out.println(val);
		}
	}
}
