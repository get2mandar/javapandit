package app.javapandit.java5.concurrent;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class JavaConcurrency_ExecuteCallableTaskExample {

	public static void main(String[] args) {

		// Demo Callable Task
		Callable<String> callableTask = new Callable<String>() {

			public String call() throws Exception {
				TimeUnit.MILLISECONDS.sleep(1000);
				return "Current Time:: " + new Date();
			}
		};

		// Executor Service Instance
		ExecutorService executor = Executors.newFixedThreadPool(1);

		@SuppressWarnings("unchecked")
		List<Callable<String>> tasksList = Arrays.asList(callableTask, callableTask, callableTask);

		// 1. Execute Tasks List using invokeAll() Method
		try {
			List<Future<String>> results = executor.invokeAll(tasksList);

			for (Future<String> result : results) {
				System.out.println(result.get());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// 2. Execute Individual Tasks using submit() Method
		Future<String> result = executor.submit(callableTask);

		while (result.isDone() == false) {
			try {
				System.out.println("The Method Return Value: " + result.get());
				break;
			} catch (Exception ex) {
				ex.printStackTrace();
			}

			// Sleep for 1 Second
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Shutdown the Executor Service
		executor.shutdownNow();
	}
}
