package com.week.six;

public class OrderNotification {

	public String sendNotification(EmailTemplate emailMessage) {
		
		StringBuilder finalMessage = new StringBuilder();
		finalMessage.append("Dear ");
		finalMessage.append(emailMessage.name);
		finalMessage.append(", thank you for placing an order for item ");
		finalMessage.append(emailMessage.item);
		finalMessage.append(". Your oder status is  ");
		finalMessage.append(emailMessage.deliveryDate);
		finalMessage.append(".");


		
		
		
		return finalMessage.toString();
	}
	
}
