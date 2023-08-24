package app.javapandit.java5.concurrent;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class JavaConcurrency_ExecutorExample {

	public static void main(String[] args) {

		// Demo Task
		Runnable runnableTask = new Runnable() {
			public void run() {
				try {
					TimeUnit.MICROSECONDS.sleep(1000L);
					System.out.println("Current Time:: " + new Date());
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
			}
		};

		// Executor Service Instance
		ExecutorService executor = Executors.newFixedThreadPool(10);

		// 1. Execute Task using execute() Method
		executor.execute(runnableTask);

		// 2. Execute Task using submit() Method
		Future<String> result = executor.submit(runnableTask, "DONE");

		while (result.isDone() == false) {
			try {
				System.out.println("The Method Return Value: " + result.get());
				break;
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		// Sleep for 1 Second
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

		// Shutdown the Executor Service
		executor.shutdownNow();
	}
}