package com.week.six;

public class OrderNotifcation {

	public String sendNotification(EmailTemplates emailMessage) {

		StringBuilder finalMessage = new StringBuilder();
		finalMessage.append("Dear ");
		finalMessage.append(emailMessage.name);
		finalMessage.append(", \nThank you for placing an order for item ");
		finalMessage.append(emailMessage.item);
		finalMessage.append(". Your order status is ");
		finalMessage.append(emailMessage.status);
		finalMessage.append(". You will receive it by ");
		finalMessage.append(emailMessage.deliveryDate);
		finalMessage.append(".");

		return finalMessage.toString();
	}

}
