package com.week.nine.fuctionalpredefine;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Driver {
	
	public static void main(String[] args) {
		
//		Predicate<Integer> isValid = (number) -> number<100;
//		boolean v = isValid.test(10);
//		System.out.println(v);
//		
//		Consumer<String> emailSender =(email)-> System.out.println("Your email "+email);
//		emailSender.accept("arya.daksh.official@gmail.com");
//		
//		Supplier<Integer> otp = ()-> new Random().nextInt(100)+50;
//		System.out.println(otp.get());
		
		Function<Integer,Integer> square = (number) -> number*number;
		System.out.println(square.apply(17));
		
		
	}

}
