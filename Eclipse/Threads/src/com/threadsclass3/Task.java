package com.threadsclass3;

public class Task {

	public void printNum() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " [" + Thread.currentThread().getName() + "]");
		}
	}

}

class PrintThread /* extends Thread */ implements Runnable {
	Task task;
	String name;

	public PrintThread(Task _task, String name) {
		this.task = _task;
		this.name = name;
		
	}

	public void run() {
		
		task.printNum();
	}
}

class Main {
	public static void main(String[] args) {
		Task task = new Task();

		PrintThread thread = new PrintThread(task, "AyushHacker");

		Thread t1 = new Thread(thread);
		t1.start();

		PrintThread thread1 = new PrintThread(task, "AyushHacker");

		Thread t2 = new Thread(thread1);
		t2.start();

	}
}