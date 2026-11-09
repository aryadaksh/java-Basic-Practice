package com.week.eight2;

/* 
 * Before java 8 interface is 100 contact base
 * default method and static method added for achieving backward Compatibilty
 * adding default and static method created another one problem code duplicy
 * so in java 9 introucded private method for removing code duplication.
 */

interface IPayment{
	void pay(int amount);
	void settle(int amount);
	
	default void print() {
		addPrivate();
		System.out.println("IPayment.print()");
	}
	
	static void printStatic() {
		//addPrivate();
		System.out.println("IPayment.print()");
	}
	
	private void addPrivate() {
		System.out.println("IPayment.addPrivate()");
		
	}
}

class UPIPayment implements IPayment{

	@Override
	public void pay(int amount) {
		System.out.println("UPIPayment.pay()");
		
	}

	@Override
	public void settle(int amount) {
	
		System.out.println("UPIPayment.settle()");
		
	}
	
}

class CreditCardPayment implements IPayment{

	@Override
	public void pay(int amount) {
		System.out.println("CreditCardPayment.pay()");
		
	}

	@Override
	public void settle(int amount) {
		System.out.println("CreditCardPayment.settle()");		
	}
	
}

public class JavaInterfaceExample {

}
