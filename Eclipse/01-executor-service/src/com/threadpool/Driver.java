package com.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;






public class Driver {

	public static void main(String[] args) {

		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 5, TimeUnit.MINUTES, 
				new ArrayBlockingQueue<>(2),
				new CustomThreadFactory(), new CustomRejectHandler());
		
		for(int i =1; i<=7; i++) {
			executor.submit(() ->{
				try {
					Thread.currentThread().sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Task  processed by: ["+Thread.currentThread().getName()+"]");
			});
		}
		
		executor.shutdown();

	}

}

class CustomRejectHandler implements RejectedExecutionHandler {

	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		System.out.println("Task Rejected " + r.toString());

	}

}

class CustomThreadFactory implements ThreadFactory {

	@Override
	public Thread newThread(Runnable r) {
		Thread thread = new Thread(r);
		thread.setPriority(Thread.NORM_PRIORITY);
		thread.setDaemon(false);
		return thread;
	}

}

