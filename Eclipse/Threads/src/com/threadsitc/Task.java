package com.threadsitc;

public class Task {

	int data;
	boolean isDataAviable = false;

	public synchronized void consume() throws InterruptedException {
		
		while(!isDataAviable) {
			wait();
			
		}
		
		System.out.println("Consuming the data: "+data);
		isDataAviable = false;
		notify();

	}

	public synchronized void produce(int _data) throws InterruptedException {
		while (isDataAviable) {
			wait();
		}
		
		this.data = _data;
		System.out.println("Producing the data: "+data);
		isDataAviable = true;
		notify();

	}

}
