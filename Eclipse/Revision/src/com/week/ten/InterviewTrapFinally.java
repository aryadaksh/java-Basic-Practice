package com.week.ten;

public class InterviewTrapFinally {

	public int getValue() {
		try {
		return 10;
		}
		catch(Exception e){
			return 20;
		}
		finally {
			return 30;
		}
	}
	
	public static void main(String[] args) {
		InterviewTrapFinally itf = new InterviewTrapFinally();
		int value = itf.getValue();
		System.out.println("Value "+value);
	}
}
