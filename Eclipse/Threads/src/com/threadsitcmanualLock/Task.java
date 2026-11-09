package com.threadsitcmanualLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Task {

	
	
	ReentrantLock lock = new ReentrantLock();
	Condition condition = lock.newCondition();

	int data;
	boolean isDataAvaible = false;

	public void produce(int _data) throws InterruptedException {
		if
		(lock.tryLock(1, TimeUnit.SECONDS)) {
			
		}
		/* lock.lock(); */

		 try { 
		while (isDataAvaible) {
			condition.await();/* wait(); */
		}
		this.data = _data;
		System.out.println("Producing the data: " + data);
		isDataAvaible = true;
		condition.signal();/* notify(); */
		
		  }
		 
		 
		  
		  
		  finally { lock.unlock(); }
		 

	}

	public void consume() throws InterruptedException {

		if(lock.tryLock(1, TimeUnit.SECONDS)){
		/* lock.lock(); */
		 try{ 
		while (!isDataAvaible) {
			condition.await();/* wait(); */
		}
		System.out.println("Consuming the data: " + data);
		isDataAvaible = false;
		condition.signal();/* notify(); */
		
		  } finally { lock.unlock(); }
		 
	}

}}