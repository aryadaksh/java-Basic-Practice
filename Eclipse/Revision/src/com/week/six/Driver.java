package com.week.six;

//import Com.week.six.quarybuilder.DyanmicQuaryBuilder;

// -> When String is fixed / static 
// -> use StringBuilder / Buffer when content needs dynamically constructed or modified Repeadly


public class Driver {
	
	public static void main(String[] args) {
//		DyanmicQuaryBuilder quaryBuilder = new DyanmicQuaryBuilder();
//		String output = quaryBuilder.quaryBuilder(null,0);
//		System.out.println("Quary Builded \n"+output);
		
//		EmailTemplate et = new EmailTemplate("Daiwik Arya", "Iphone", "In-Transit", "19-07-2026");
//		
//		OrderNotification orderNotification;
//		orderNotification = new OrderNotification();
//		
//		String output =orderNotification.sendNotification(et);
//		System.out.println(output);
		
		QuaryConstructor constructor = new QuaryConstructor();
		String output = constructor.constructQuary("Tcs_678132", 0);
		System.out.println(output);
		
	}

}
