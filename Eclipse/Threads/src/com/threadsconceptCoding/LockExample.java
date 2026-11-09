package com.threadsconceptCoding;

public class LockExample {
	
	public synchronized void task1() {
		System.out.println("This is task 1 is whole methods is synchronized..   ["+Thread.currentThread().getName()+"]");
	}
	
	public  void task2() {
		System.out.println("Some random. code which doesn't need synchronized  ["+Thread.currentThread().getName()+"]");
		synchronized(this) {
		System.out.println("This is task 1 is whole methods is synchronized..   ["+Thread.currentThread().getName()+"]");
		}
		
	}
	
	public void task3() {
		System.out.println("MonitorLockExample.task3()  ["+Thread.currentThread().getName()+"]");
	}
	
	public static synchronized void task4() {
		System.out.println("This is task4() is whole methods is synchronized.. and static so its will be class  ["+Thread.currentThread().getName()+"]");
	}
	
	public static void task5() /* throws *//*InterruptedException*/ {
		System.out.println("  static  Some random. code which doesn't need synchronized ["+Thread.currentThread().getName()+"]");
		
		
		synchronized (LockExample.class) {
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(" TAsk 5  Hello this is class Lock Synchorized block ["+Thread.currentThread().getName()+"]");
			
		}
		
	}
	
	public static void task6() {
		System.out.println("LockExample.task6()["+Thread.currentThread().getName()+"]");
	}

}
