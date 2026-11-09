package com.week.five;

public class Viewer {
	
	public static int totalViewers = 0;
	{
		totalViewers++;
	}
	
	public Viewer() {
		
		
	}
	public Viewer(String type) {
		
	}
	
	
}

class Driver1{
	public static void main(String[] args) {
		
	
	Viewer v1 = new Viewer();
	Viewer v2 = new Viewer("PAID");
	Viewer v3 = new Viewer();
	
	System.out.println("Total Viewer: "+Viewer.totalViewers);
	}
}
