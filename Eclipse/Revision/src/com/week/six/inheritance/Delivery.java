package com.week.six.inheritance;

public class Delivery {

	Post time() {
		
		System.out.println("Delivery.time()");
		
		return new Post();
	}
	
}

class ExpressDelivery extends Delivery{
	
	SpeedPost time() {

		System.out.println("Delivery.time()");

		return new SpeedPost();
	}
}

class MainApp{
	
	public static void main(String[] args) {
		Delivery delivery;
		delivery = new ExpressDelivery();
		delivery.time();
		
		ExpressDelivery expressDelivery =  (ExpressDelivery) delivery;
		
		delivery =  expressDelivery;
		expressDelivery.time();
		
	}
}