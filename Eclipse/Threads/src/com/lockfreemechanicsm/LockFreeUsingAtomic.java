package com.lockfreemechanicsm;

import java.util.concurrent.atomic.AtomicInteger;

public class LockFreeUsingAtomic {

	AtomicInteger atomicInteger = new AtomicInteger(0);

	public void increaseCount() {
		atomicInteger.incrementAndGet();
	}

	public int getCount() {
		return atomicInteger.get();
	}

}

class Main {
	public static void main(String[] args) throws InterruptedException {

		LockFreeUsingAtomic counter = new LockFreeUsingAtomic();

		Thread t1 = new Thread(() -> {

			for (int i = 0; i < 200; i++) {
				counter.increaseCount();
			}

		});

		Thread t2 = new Thread(() -> {

			for (int i = 0; i < 200; i++) {
				counter.increaseCount();
			}

		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

	}
}
