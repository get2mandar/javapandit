package app.javapandit.java5.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class JavaConcurrency_ExecutorInstancesExample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Executes Only One Thread
		ExecutorService singleES = Executors.newSingleThreadExecutor();

		// Internally Manages Thread Pool of 2 Threads
		ExecutorService multiFixedES = Executors.newFixedThreadPool(2);

		// Internally Manages Thread Pool of 10 Threads to Run Scheduled Tasks
		ExecutorService multiScheduledES = Executors.newScheduledThreadPool(10);

		// Using Constructors
		// Thread Count: Minimum 10, Maximum 100
		// Keep Alive Time: 5 Milliseconds
		// A Blocking Queue to Watch for Tasks in Future
		ExecutorService executorService = new ThreadPoolExecutor(10, 100, 5L, TimeUnit.MILLISECONDS,
				new LinkedBlockingQueue<Runnable>());
	}
}
