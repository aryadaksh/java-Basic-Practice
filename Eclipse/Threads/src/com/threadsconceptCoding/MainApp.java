package com.threadsconceptCoding;

public class MainApp {

	public static void main(String[] args) {
		SharedObject obj = new SharedObject();
		
		 Thread t1 = new Thread(new ProducerTask(obj));
		 
		 Thread t2 = new Thread(new ConsumerTask(obj));
		 
		 t1.setName("Produce");
		 t1.start();
		 
		 t2.setName("Consume");
		 t2.start();
		

	}
}
