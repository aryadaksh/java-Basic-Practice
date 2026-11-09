package com.fuctionalinterface;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Chaining {

	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		
		Predicate<Integer> isEven = num1 -> num1 % 2 == 0;
		Supplier<Integer> randomIntSupplier = () -> {
			int random = new Random().nextInt(100);
			System.out.print("Random Number "+random);
			return random;
		};
		Consumer<Boolean> printAnswer = answer -> System.out.println(" is even? "+answer);
		
		printAnswer.accept(isEven.test(randomIntSupplier.get()));
		printAnswer.accept(isEven.test(randomIntSupplier.get()));
		printAnswer.accept(isEven.test(randomIntSupplier.get()));
	}
}
