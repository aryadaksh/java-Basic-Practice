package com.cmf;

import java.util.concurrent.CompletableFuture;

public class DriverThenRun {

	// thenRun() -> noInput,return Void -> just run after the previous stage is
	// Completed
	public static void main(String[] args) {
		CompletableFuture.supplyAsync(() -> 20).thenRun(() -> System.out.println("COMPLETED")).join();

		// Conumer-Style(thenAccept()) -> receives the result, return nothing
		CompletableFuture.supplyAsync(() -> 20).thenAccept((n) -> System.out.println("get " + n)).join();
	}
}
