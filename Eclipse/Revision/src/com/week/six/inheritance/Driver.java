package com.week.six.inheritance;

class Employee{}
class Manager extends Employee{}

public class Driver {

	public static void main(String[] args) {
		//Employee emp = new Manager();  // this is upacasting 
		
		//Manager manager = new Employee(); -> its will throw error so we need to explictily downcast it
		//Manager manager = (Manager)new Employee(); // but it will throw excpetion at runtime 
		// for doing downcasting we need to do first upcast and then downcast
		
		//like 
	//	Employee emp = new Manager(); // -> first upcast
		//then down cast
	//	Manager managerd = (Manager) emp;
		
		// this is two step downcast
		
		
//		ObjectFactory objFact = new ObjectFactory();
//		Object vale = objFact.getObject("Manager");
//		System.out.println(vale);
		
		
		Customer customer ;
		customer= new Customer();
		
		customer.calculatePrice();
		
		customer =  new GoldCustomer();
		customer.calculatePrice();
		
		
	}
}
