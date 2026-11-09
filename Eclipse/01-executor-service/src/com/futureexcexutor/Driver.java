package com.futureexcexutor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Driver {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.HOURS, new ArrayBlockingQueue<Runnable>(10),  Executors.defaultThreadFactory() 
			
			 , new ThreadPoolExecutor.AbortPolicy());
		
		// case one for submit method
		/*
		 * Future<?> futureResponse1 = executor.submit(() ->{
		 * System.out.println("THis is submit method using runnable no return type");
		 * });
		 * 
		 * futureResponse1.get();
		 */
		
		//case 2 -> 
		/*
		 * List<Integer> value = new ArrayList<>(); Future<List<Integer>> futureReponse2
		 * = executor.submit(new MyRunnable(value), value);
		 * 
		 * futureReponse2.get();
		 * 
		 * //1 way System.out.println("Way 1 "+value.get(0));
		 * 
		 * // 2 way List<Integer> result = futureReponse2.get();
		 * System.out.println("Way 2 "+result.get(0));
		 */
		
		//case 3 
		Future<?> result = executor.submit(()->{
			
			return  100;
			
		});
		
		System.out.println(result.get());
		
		
	}

}
