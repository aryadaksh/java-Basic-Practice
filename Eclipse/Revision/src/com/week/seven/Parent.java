package com.week.seven;

public class Parent {

	public Parent() {
		display();
	}
	
	void display() {
		System.out.println("Parent");
	}
}

class Child extends Parent{
	@Override
	public void display() {
		System.out.println("Child "+ " ");
	}
}

class MainApp{
	public static void main(String[] args) {
		Child c = new Child();
	}
}
