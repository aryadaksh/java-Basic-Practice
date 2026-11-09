package com.fuctionalinterface;

import java.util.function.Supplier;

public class SuppliersExample {
	
	public double squareLazy(Supplier<Double> lazyValue) {
		return Math.pow(lazyValue.get(),2);
	}
	
	public static void main(String[] args) {
		
//		Supplier<Double> lazyValue = () -> {
//		//	Uninterruptibles.sleepUniterruptibly(1000, TimeUnit.)
//		};
	}

}
