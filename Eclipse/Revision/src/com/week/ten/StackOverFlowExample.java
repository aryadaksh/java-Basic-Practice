package com.week.ten;

public class StackOverFlowExample {
	
	public void method1() {
		method1();
	}

	public static void main(String[] args) {
		StackOverFlowExample sofe = new StackOverFlowExample();
		sofe.method1();
	}
}
