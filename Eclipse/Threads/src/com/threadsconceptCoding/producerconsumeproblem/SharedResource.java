package com.threadsconceptCoding.producerconsumeproblem;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {

	private Queue<Integer> sharedBuffer;
	private int bufferSize;
	
	public SharedResource(int i) {
		sharedBuffer = new LinkedList<Integer>();
		this.bufferSize = i;
	}

	public synchronized void produce(int item) throws Exception
	{
		while(sharedBuffer.size() == bufferSize)
		{
			System.out.println("Buffer is full, Producer is waiting for consumer");
			wait();
		}
		sharedBuffer.add(item);
		System.out.println("Produce: "+item);
		
		notify();
	}
	
	public synchronized int consume() throws Exception {
		
		while(sharedBuffer.isEmpty()) {
			System.out.println("Buffer is empty, Consumer is waiting for producer");
			wait();
		}
		int item = sharedBuffer.poll();
		System.out.println("Consumed: "+item);
		
		notify();
		return item;
		
	}
}
