package com.threadsbook;

public class PingPong extends Thread
{
	private String word;
	private int delay;
	
	
	public PingPong(String whatToSay,int delayTime) {
		this.word = whatToSay;
		this.delay = delayTime;
	}
	
	public void run() {
		for(;;) {
			System.out.print(word+" ");
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		new PingPong("ping", 33).start();
		new PingPong("PONG", 100).start();
	}

}
