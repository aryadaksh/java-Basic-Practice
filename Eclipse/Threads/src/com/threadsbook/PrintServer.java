package com.threadsbook;

public class PrintServer implements Runnable
{
	private final PrintQueue requests = new PrintQueue();

	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			realPrint(requests.remove());
		}
		
	}
	
	private void realPrint(PrintJob job) {
		// TODO Auto-generated method stub
		
	}

	public void print(PrintJob job) {
		requests.add(job);
	}
	
	

}
