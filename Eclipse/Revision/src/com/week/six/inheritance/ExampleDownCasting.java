package com.week.six.inheritance;


class Vehicle{
	
	
	void stop() {
		System.out.println("Vehicle.stop()");
	};
}


class Bike extends Vehicle{
	
	
	void stop() {
		System.out.println("Bike.stop()");
	}
}
public class ExampleDownCasting {
	
	public static void main(String[] args) {
		Vehicle v = new Bike();
		
		Bike b = (Bike) v;
		b.stop();
	} 
	

}
