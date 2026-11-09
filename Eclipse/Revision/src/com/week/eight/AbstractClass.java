package com.week.eight;

/*
 * Abstract Class is class its like contarct (0-100%)
 * its have constructor for chaining and instiliztion but we cannot create object of 
 * abstract class its should be inherited for using abstarct class 
 * its abstract method plus concrate method class normal class who inherit abstract class should have 
 * to implements its
 * 	
 * 		Abstract Classes Force child classes to implement
 * 
 */

abstract class PaymentSystem0{
	public PaymentSystem0() {
		
	}
	public abstract void doTransaction();
	public final void doSomething() {
		System.out.println("PaymentSystem0.doSomething()");
	}
}


public class AbstractClass extends PaymentSystem0 {
	
	public void doTransaction() {
		System.out.println("AbstractClass.doTransaction()");
	}
	/*
	 * Multiple markers at this line
	- Cannot override the final method from PaymentSystem0
	- overrides com.week.eight.PaymentSystem0.doSomething
	 */
//	@Override
//	public  void doSomething() {
//		System.out.println("PaymentSystem0.doSomething()");
//	}
}
//the class Experiment can be either abstract or final, not both
// final abstract  class Experiment
final   class Experiment
{
	final static int  VALUE = 10; // its become Constant
	public static void main(String[] args) {
		//Cannot instantiate the type PaymentSystem0
		//PaymentSystem0 p = new PaymentSystem0();
		
		PaymentSystem0 p = new AbstractClass();
		p.doTransaction();
		
		
	}
}
//The type Driver1 cannot subclass the final class Experiment
//class Driver1 extends Experiment{
//	
//}
