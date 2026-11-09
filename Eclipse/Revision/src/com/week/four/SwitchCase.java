package com.week.four;

/*
 * switch (key) {
		case value:
			
			break;

		default:
			break;
		}
 */

public class SwitchCase {
	
	public static String identifyDay(int number) {
		String day = null;
		switch (number) {
		
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thuesday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 7:
			day = "Funday";
		default:
			day = "unknow";
			break;
		}
		return day;
	}

}
