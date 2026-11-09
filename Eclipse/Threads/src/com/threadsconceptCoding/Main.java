package com.threadsconceptCoding;

public class Main {

	public static void main(String[] args) {
		SharedObject obj = new SharedObject();

		Thread t1 = new Thread(() -> {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			obj.addItem();
		});

		Thread t2 = new Thread(() -> {
			System.out.println("Consumer THread is called [" + Thread.currentThread().getName() + "]");
			obj.consumeItem();
		});
		
		t1.setName("Producer");
		t1.start();
		
		t2.setName("Consumer");
		t2.start();
		
	}
}
