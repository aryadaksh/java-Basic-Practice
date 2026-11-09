package com.threadsclass3;

class MyThread implements Runnable{

	// run return type is void 
	@Override
	public void run() {


		for(int i = 0; i<10 ; i++) {
			
			if(i == 5) {
				System.out.println(" Sleeping ");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(" Sleeping is over now THread went TO Runnable to running  ");
			}
			
			System.out.println(i);
		}
		
	}
	
}

public class Driver {
	
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		Thread t1 = new Thread(thread);
		t1.start();
	}

}
