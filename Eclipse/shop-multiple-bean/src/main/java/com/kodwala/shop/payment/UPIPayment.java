package com.kodwala.shop.payment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UPIPayment implements PaymentSevice
{
	private static final Logger log = LogManager.getLogger(UPIPayment.class);

	@Override
	public String pay(double amount) {
		
		return "Paid " + amount + " via UPI";
	}

}
