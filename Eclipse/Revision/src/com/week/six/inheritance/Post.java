package com.week.six.inheritance;
 
class Post{
	void timeDelivery() {
		System.out.println("Time Of Delivery: 7 hrs");
	}
}

class SpeedPost extends Post {

	void timeDelivery() {
		System.out.println("Time Of Delivery: 7 hrs");
	}
}
