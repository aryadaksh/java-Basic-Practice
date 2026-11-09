package com.threadsconceptCoding;

public class Driver {

	public static void main(String[] args) {

		LockExample obj = new LockExample();

		/*
		 * Thread t1 = new Thread(() -> obj.task1()); Thread t2 = new Thread(() ->
		 * obj.task2()); Thread t3 = new Thread(() -> obj.task3());
		 */

		Thread t4 = new Thread(() -> LockExample.task4());
		Thread t5 = new Thread(() -> LockExample.task5());
		Thread t6 = new Thread(() -> LockExample.task6());

		/*
		 * t1.start(); t2.start(); t3.start();
		 */

		t4.start();
		t5.start();
		t6.start();

	}
}
