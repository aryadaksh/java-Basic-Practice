package com.week.three;

public class PaymentProcessor {
	
	public static boolean checkSenderDetails(String senderDetails) {
		System.out.println("Sender Details is Verified");
		return true;
	}
	
	public static boolean checkReceiverDetails(String receiverDetails) {
		System.out.println("Receiver Details is Verified");
		return true;
	}
	
	public static int checkBalance(String senderAccount) {
		System.out.println("Checking the Balance");
		return 1200;
	}
	
	public static void fundTransfer(String senderDetails, String receiverDetails) {
		System.out.println("Fund tranfer started");
		
		boolean isSenderDetailsValid = PaymentProcessor.checkSenderDetails(senderDetails);
		System.out.println(isSenderDetailsValid);
		
		boolean isReceiverDetails = PaymentProcessor.checkReceiverDetails(receiverDetails);
		System.out.println(isReceiverDetails);
		
		int balance = PaymentProcessor.checkBalance("87998203");
		System.out.println("Balance: "+balance);
	}

	public static void main(String args[]) {
		String senderDetails = "SENDER123";
		String receiverDetails = "RECEIVER456";
		
		PaymentProcessor.fundTransfer(senderDetails,receiverDetails);
	}
}
