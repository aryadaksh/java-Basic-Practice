package com.threadsitcmanualLock;

public class Producer extends Thread
{
	Task task;
	
	public Producer(Task _task) {
		super("Producer");
		this.task = _task;
	}

	public void run() {
		for(int i = 0; i<5; i++) {
		try {
			task.produce(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
