package com.lockfreemechanicsm;

class Counter{
	
	int count;
	
	public /* synchronized */ void increaseCount() {
		count++;
	}
	
	public int  getCount() {
		return count;
	}
	
}


public class Driver {
	
	public static void main(String[] args) throws InterruptedException {
		
		Counter counter = new Counter();
		
		/*
		 * for(int i = 0; i<400; i++) { counter.increaseCount(); }
		 */
		
		Thread t1 = new Thread(() ->{
			for(int i = 0; i<200; i++) { counter.increaseCount();}
		});
		
		Thread t2 = new Thread(() ->{
			for(int i = 0; i<200; i++) { counter.increaseCount();}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(counter.getCount());
		
	}
	
	

}
