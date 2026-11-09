package com.exeSer1;

class AddTwo implements Runnable
{
	int firstNum;
	int secondNum;
	
	public AddTwo(int _firstNum,int _secondNum) {
		this.firstNum = _firstNum;
		this.secondNum = _secondNum;
	}
	
	private  int sum() {
		return firstNum+secondNum;
	}

	@Override
	public void run() {
		
		int result = sum();
		if(result > firstNum && result > secondNum) {
			System.out.println("Success");
		}
		else {
			System.out.println("Failure");
		}
		
	}
	
	
}

public class Driver2 {
	public static void main(String[] args) {
		AddTwo sum = new AddTwo(49, 4);
		
		Thread t1 = new Thread(sum);
		t1.start();
		
		if(t1.equals("Success")) {
			Thread t2 = new Thread(()->{
				System.out.println("Yess Confirm");
			});
			
			t2.start();
			
		}
	}

}
