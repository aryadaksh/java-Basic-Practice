package com.threadsconceptCoding.depricated;

public class Driver {
	
	public static void main(String[] args) {
		SharedResource sharedResource = new SharedResource();
		
		Thread t1 = new Thread(() -> sharedResource.produce());
		
		Thread t2 = new Thread(() -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sharedResource.produce();});
		
		t1.start();
		t2.start();
	}

}
