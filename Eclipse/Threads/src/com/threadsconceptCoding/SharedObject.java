package com.threadsconceptCoding;

public class SharedObject {
	
	boolean isItemAvaiable = false;
	
	public synchronized void addItem() {
		
		isItemAvaiable = true;
		
		System.out.println("addItem method is invoked by: ["+Thread.currentThread().getName()+"]");
		
		notifyAll();
		
		
	}
	
	public synchronized void consumeItem() {
		
		System.out.println("ConsumeItem method is invoked by: ["+Thread.currentThread().getName()+"]");
		
		
		// using while loop  to avoid "spurious wake-up", sometimes because of system noise
		
		while(!isItemAvaiable) {
			try {
				
				System.out.println("Thread [" +Thread.currentThread().getName() +"] is waiting ");
				wait();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Item Consumed by: ["+Thread.currentThread().getName()+"]");
		isItemAvaiable = false;
	}

}
