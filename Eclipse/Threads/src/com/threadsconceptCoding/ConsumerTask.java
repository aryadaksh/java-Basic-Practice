package com.threadsconceptCoding;

public class ConsumerTask implements Runnable
{
	SharedObject sharedObject;

	public ConsumerTask (SharedObject resource) {
		this.sharedObject = resource;
	}
	
	@Override
	public void run() {
		System.out.println("Consumer THread is called ["+Thread.currentThread().getName()+"]");
		sharedObject.consumeItem();
		
	}

}
