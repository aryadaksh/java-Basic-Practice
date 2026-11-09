package com.week.five;

public class Payment {

	private String paymentRefId,status,response;
	private int amount;
	
	private Payment(String _paymentRefId,String _status,String _response,int _amount) {
		this.paymentRefId = _paymentRefId;
		this.amount = _amount;
		this.response = _response;
		this.status = _status;
	}
}
