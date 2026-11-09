package com.test.thread;

public class NewThread2 extends Thread
{
	Thread t;
	String name;
	public NewThread2(String threadName) {
		name = threadName;
		t = new Thread(this,name);
		t.start();
				 
	}
	
	public void run() {
		
	}

}

class Driver
{

	public static void main(String[] args) {
		NewThread2 obj1 = new NewThread2("one");
		NewThread2 obj2 = new NewThread2("two");
		
		try {
			Thread.sleep(1000);
			System.out.println(obj1.t.isAlive());
		}
		catch(InterruptedException e) {
			System.out.println("Main Thread interrupted");
		}
		
	}
}
