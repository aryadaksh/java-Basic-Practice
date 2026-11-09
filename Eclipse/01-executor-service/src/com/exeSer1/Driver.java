package com.exeSer1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread extends Thread
{
	
	int task1;
	
	public MyThread(int _task) {
		super("DakshThread");
		this.task1 = _task;
	}
	
	public void run() {
		
		System.out.println("Thread.run ... Task Id: "+task1+" ["+Thread.currentThread().getName()+"]");
	}
	
	
	
	
	
}

public class Driver {
	
	public static void main(String[] args) {
		
		ExecutorService exec = Executors.newFixedThreadPool(5);
		for(int i = 0; i<10; i++) {
		exec.execute(new MyThread(i));
		}
		exec.shutdown();
		
	}

}
