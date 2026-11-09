package com.threadsconceptCoding.producerconsumeproblem;

/*
 * Why stop,resume , suspended method is deprecated
 * Stop: Terminates the thread abruptly, No lock release, No resource clean up happens
 * Suspend: Put the Thread on hold (suspend) for temporarily.No lock is release too.
 * Resume: Used to resume the execution of Suspended thread.
 */


public class Driver {
	public static void main(String[] args) {
		SharedResource sharedResource = new SharedResource(3);
		Thread t1 = new Thread(() -> {
			for(int i = 1; i<=6; i++) {
				try {
					sharedResource.produce(i);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i = 1; i<=6; i++) {
				try {
					sharedResource.consume();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
	}

}
