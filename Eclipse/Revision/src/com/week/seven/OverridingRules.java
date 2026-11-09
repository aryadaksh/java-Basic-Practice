package com.week.seven;

/*
 * Method Overriding
 * 1. Method Name -> will same as exactly same
 * 2. Parameters - > same ordern, same types, same number
 * 3. Return Types -> same or covarient // 1.5
 * 4. Access Modifier -> same or Wider(never narrow)
 * 5. Exceptions -> specific rules
 */

class Animal {
	void eat() {
		System.out.println("Animal.eat()");
	}

	void sleep(int x) {
		System.out.println("Animal.sleep()");
	}

	Leg leg() {

		return new Leg();
	}

}

class Cat extends Animal {

	@Override
	void eat() {
		System.out.println("Cat.eat()");
	}

	@Override
	void sleep(int x) {
		System.out.println("Cat.sleep()");
	}

	TwoLeg leg() {

		return new TwoLeg();
	}

}

public class OverridingRules {

	public static void main(String[] args) {
		Animal a = new Cat();
		a.eat();
	}

}
