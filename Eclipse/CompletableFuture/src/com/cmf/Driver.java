package com.cmf;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;
import java.util.concurrent.TimeUnit;

public class Driver {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		// there is two .supplyAsync() first One is which only one input -> supplyAsync(Supplier<U> supplier)
		/*
		 * thats internally calls asyncSupplyStage(ASYNC_POOL, supplier)
		 * and another one is 
		 * supplyAsync(Supplier<U> supplier,Executor executor) ->  which internally calls -> 
		 * thats internally calls asyncSupplyStage(screenExecutor(executor), supplier) 
		 */
		
		/*CompletableFuture<Integer> cmf1 = CompletableFuture.supplyAsync(() -> {
			System.out.println("Current Thread::"+Thread.currentThread().getName());
			return 30;},Executors.newCachedThreadPool());
		System.out.println("Using .get() "+cmf1.get()); // to use .get() we have to throw exception like InterruptedException and ExecutionException
		System.out.println("using .join() "+cmf1.join()); //  main difference is that in join we doesn't need to throw exception
		
		
		CompletableFuture<Integer> cmf2 = CompletableFuture.supplyAsync(() -> {
			System.out.println("Current Thread::"+Thread.currentThread().getName());
			return 5*5;}, Executors.newFixedThreadPool(5));
		cmf2.thenApplyAsync((n) -> {return n*n;});
		
		CompletableFuture<String> finalCmf = cmf2.thenCombineAsync(cmf1, (a,b) -> {
			int sum = a+b;
			System.out.println(sum);
			System.out.println("Current Thread::"+Thread.currentThread().getName());
			return "SUCCESS";
		});
		
		System.out.println(cmf1.join());
		System.out.println(cmf2.join());
		System.out.println(finalCmf.join());*/
		
		ThreadPoolExecutor customExecutor = new ThreadPoolExecutor(0, 6, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2), new CustomRejectedExecutionHandler()) ;
		
		CompletableFuture<Integer> result = CompletableFuture.supplyAsync(() -> {
			System.out.println("Current Thread::"+Thread.currentThread().getName());
			return 20;
		},customExecutor).thenApply((n) ->{

			System.out.println("Current Thread::"+Thread.currentThread().getName());
			return n*10;
		}).thenApply((n) ->{

			System.out.println("Current Thread::"+Thread.currentThread().getName());
			return n*10;});
		System.out.println(result.get());
	}

}
