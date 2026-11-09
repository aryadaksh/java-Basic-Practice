package com.threadsconceptCoding;

public class ProducerTask implements Runnable
{

	SharedObject sharedObject;
	
	public ProducerTask(SharedObject resource) {
		this.sharedObject = resource;
	}
	
	@Override
	public void run() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sharedObject.addItem();
		
	}
	

}
