package com.cmf;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class CustomRejectedExecutionHandler implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        // Log the failure
        System.err.println("Task " + r.toString() + " was rejected by the executor!");
        
        // Example logic: Print pool stats to debug why it failed
        System.err.println("Active Threads: " + executor.getActiveCount());
        System.err.println("Queue Remaining Capacity: " + executor.getQueue().remainingCapacity());
        
        // Choose your strategy (e.g., throw custom exception, log to a file, alert DevOps)
    }
	

}
