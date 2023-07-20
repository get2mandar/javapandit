package app.javapandit.java4.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex_PatternMatchingExample {

	public static void main(String[] args) {

		// Input String for Matching the RegEx Pattern
		String inputStr = "This is a fruit. There are 33 (thirty-three) fruits.";

		// RegEx to be Matched
		String regexStr = "Th";

		// Step1: Compile a RegEx via static method Pattern.compile()
		// Default is Case-Sensitive
		Pattern pattern = Pattern.compile(regexStr);

		// For Case-Insensitive Matching
		// pattern = Pattern.compile(regexStr, Pattern.CASE_INSENSITIVE);

		// Step2: Allocate Matching Engine from the Compiled RegEx Pattern
		// And Bind to the Input String
		Matcher matcher = pattern.matcher(inputStr);

		// Step3: Perform Matching and Process the Matching Results

		// Matcher.find(), Finds the Next Match
		while (matcher.find()) {
			System.out.println("find() found substring \"" + matcher.group() + "\" starting at index " + matcher.start()
					+ " and ending at index " + matcher.end());
		}

		// Matcher.matches(), To Match the Entire Input String
		if (matcher.matches()) {
			System.out.println("matches() found substring \"" + matcher.group() + "\" starting at index "
					+ matcher.start() + " and ending at index " + matcher.end());
		} else {
			System.out.println("matches() found nothing");
		}

		// Matcher.lookingAt(), To Match From the Beginning of the Input String
		if (matcher.lookingAt()) {
			System.out.println("lookingAt() found substring \"" + matcher.group() + "\" starting at index "
					+ matcher.start() + " and ending at index " + matcher.end());
		} else {
			System.out.println("lookingAt() found nothing");
		}
	}

}