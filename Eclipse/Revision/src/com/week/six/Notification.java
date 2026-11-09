package com.week.six;

class ResellerNotification extends Notification{
	
	public void resellerId() {
		System.out.println("THis is inside reseller");
	}
	
}

public class Notification {
	
	public void sendNotification(String emailAddress, String message) {
		System.out.println("Sending email to "+emailAddress+" : "+message);
	}

}

class Drriver{
	public static void main(String[] args) {
		ResellerNotification reseller = new ResellerNotification();
		reseller.sendNotification("daiwik@mail.com", "Please do this things \nThank You");
		reseller.resellerId();
	}
}
