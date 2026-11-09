package com.cmf;

import java.util.concurrent.CompletableFuture;

public class DriverException {
	public static void main(String[] args) {
		
		// Only run if something is failed
		CompletableFuture<Integer> safe =CompletableFuture.supplyAsync(()->{
			if(true) {
				throw new RuntimeException("boom");
			}
			return 20;
		}).exceptionally(ex -> -1); // fallback value
		
		System.out.println(safe.join());
		
		// handles : both success and failure 
		CompletableFuture<Integer> either = CompletableFuture.supplyAsync(() -> 20).handle((value,ex) -> ex == null ? value : -1);
		System.out.println(either.join());
	}

}
