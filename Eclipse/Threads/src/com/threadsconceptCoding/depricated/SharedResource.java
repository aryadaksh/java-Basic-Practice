package com.threadsconceptCoding.depricated;

public class SharedResource {
	
	/* synchronized */
	
	boolean isAvaiable = false;
	
	public synchronized void produce() {
		System.out.println("Lock accuired ["+Thread.currentThread().getName()+"]");
		isAvaiable = true;
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Lock Realse ["+Thread.currentThread().getName()+"]");
	}

}
