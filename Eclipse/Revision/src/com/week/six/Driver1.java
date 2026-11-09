package com.week.six;

public class Driver1 {
	
	public static void main(String[] args) {
//		EmailTemplates email = new EmailTemplates("Daksh Arya", "IPhone 17", "Packed", "28 July");
//		
//		OrderNotifcation notifier = new OrderNotifcation();
//		String message = notifier.sendNotification(email);
//		System.out.println(message);
		
		QueryConstructor q = new QueryConstructor();
		System.out.println(q.constructQuery("Tcs_10", "1000000"));
	}

}
