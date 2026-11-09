package com.week.three;
/*
 * for(initilaliztion; condition; update){
 * // body -- business Logic
 * 
 * }
 */


public class Loop {
	
	static void doWhileLoopInfitiy() {
		do {
			System.out.println("Khihihi!!");
		}
		while(true);
	}
	
	//do-While is same as while loop its basically it will runs at least one time any How
	static void doWhileLoopExample() {
		int i = 1;
		do {
			
			System.out.println("15" +" * "+i+" = "+15*i);
			i++;
		}
		while(i<=10);
	}
	
	static void whileLoopInfinity() {
		while(true) {
			System.out.println("Kihihihi!!!");
		}
	}
	
	// when to use while loop 
	// when we don't know loops will run how many times
	
	static void whileLoopExample() {
		int i = 1;
		while(i<= 10) {
			System.out.println("11"+" "+"*"+" "+i+" = "+11*i);
			i++;
		}
	}
	
	static void forLoopInfinite() {
		for(;;) {
			System.out.println("Khihihi");
		}
	}
	
	static void forLoopExample() {
		for(int i = 1; i<=10; i++) {
			System.out.println("5"+" "+"*"+" "+ i +" = "+5*i );
		}
	}
	
	public static void main(String[] args) {
		
		//Loop.forLoopExample();
		//Loop.forLoopInfinite();
		//Loop.whileLoopExample();
		//Loop.whileLoopInfinity();
		//Loop.doWhileLoopExample();
		Loop.doWhileLoopInfitiy();
	}

}
