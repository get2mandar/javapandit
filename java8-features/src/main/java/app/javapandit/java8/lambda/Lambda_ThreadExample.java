package app.javapandit.java8.lambda;

public class Lambda_ThreadExample {

	public static void main(String[] args) {
		try {
			System.out.println("Wait 2 Seconds:");
			Thread.sleep(2000L);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

		new Thread(() -> System.out.println("My Runnable")).start();
	}
}
