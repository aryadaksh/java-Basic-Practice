package com.threadsitc;

public class Driver {

	public static void main(String[] args) {
		Task task = new Task();

		/*
		 * Producer producer = new Producer(task); Consumer consumer = new
		 * Consumer(task);
		 * 
		 * producer.start(); consumer.start();
		 */

		new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				try {
					task.produce(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();

		new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				try {
					task.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
	}
}
