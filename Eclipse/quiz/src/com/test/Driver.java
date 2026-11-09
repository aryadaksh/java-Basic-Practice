package com.test;


class Animal{
	static {
		System.out.println("Animal Static");
	}
	
	
	void print() {
		System.out.println("Dog Print");
	}
	
}
class Dog extends Animal{
	static {
		System.out.println("Dog Static");
	}
	@Override
	void print() {
		System.out.println("Dog Print");
	}
}

class Puppy extends Dog{
	static {
		System.out.println("Puppy Static");
	}
	
	@Override
	void print() {
		System.out.println("Puppy Print");
	}
	
	
}

class Human{
	
	static {
		System.out.println("Human Static");
	}
	
	Animal doSomething() {
		System.out.println("Human");
		return new Animal();
	}
	
	
}

class People extends Human{
	static {
		System.out.println("People Static");
	}
	Puppy doSomething() {
		System.out.println("People");
		return new Puppy();
	}
	
	
}

public class Driver {
	
	public static void main(String[] args) {
		
		Human human = new People();
		human.doSomething();
		
		
	}

}
