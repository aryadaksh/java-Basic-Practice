package com.week.four;

public class Booking {
	
	private static void validateBooking(String userType, int numberOfTicket) {
		if(userType.equals("Retails")) {
			if(numberOfTicket > 6) {
				System.out.println("Not Allowed , retails user can book ,max 6 tickets");
			}
			else {
				System.out.println("Booking Confirmed for the retails User");
			}
		}else if(userType.equals("Agent")) {
			System.out.println("Booking confirm for agent , any Number of ticket allowed");
		}else {
			System.out.println("Booking is not supported for unknown user type");
		}
		
		
	}
	
	public static void bookTicket(String userType, int numberOfTicket) {
		Booking.validateBooking(userType, numberOfTicket);
	}

}
