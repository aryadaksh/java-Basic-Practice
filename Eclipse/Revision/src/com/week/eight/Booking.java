package com.week.eight;

public class Booking   {

	public void bookTicket() {
		System.out.println("Book Ticket: "+ITicketBooking.TICKET_PRICE);
	}
	
	public void cancelTicket() {
		System.out.println("Cancel this ticket Please");
	}
}
