package com.threadsitcmanualLock;

public class Consumer extends Thread
{
	
	Task task;
	
	public Consumer(Task _task) {
		super("Consumer");
		this.task = _task;
	}
	
	@Override
	public void run() {
		for(int i =0; i<5; i++) {
			try {
				task.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
