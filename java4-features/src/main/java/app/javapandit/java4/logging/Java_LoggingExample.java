package app.javapandit.java4.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Java_LoggingExample {

	static {
		// Must Set Before The Logger
		String path = Java_LoggingExample.class.getClassLoader().getResource("logging.properties").getFile();
		
		System.out.println("To See from where Log Properties File is picked Up:");
		System.out.println(path);
		System.setProperty("java.util.logging.config.file", path);
		
		System.out.println("To See where Log Output File gets Created:");
		String userHome = System.getProperty("user.home");
		System.out.println(userHome);
	}

	private static Logger logger = Logger.getLogger(Java_LoggingExample.class.getName());

	public static void main(String[] args) {

		// Change Log Level using Set Level, Default Level Info
		// logger.setLevel(Level.WARNING);

		logger.info("This is Info Logger Message");

		logger.log(Level.WARNING, "This is Warning Level Log Message");

		logger.log(Level.SEVERE, "This is Severe Level Log Message");

		System.out.println("System Print Java Logging APIs");
	}

}
