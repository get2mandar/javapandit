package app.javapandit.java4.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex_FindRepalceExample {

	public static void main(String[] args) {

		// Input String for Matching the RegEx Pattern
		String inputStr = "This is a fruit. There are 33 (thirty-three) fruits.";

		// RegEx to be Matched
		String regexStr = "fruit";

		// Replacement String when Pattern Matched
		String replacementStr = "flower";

		// Step1: Allocate a Pattern Object to Compile a RegEx
		Pattern pattern = Pattern.compile(regexStr, Pattern.CASE_INSENSITIVE);

		// Step2: Allocate a Matcher Object from the Pattern and Provide Input
		Matcher matcher = pattern.matcher(inputStr);

		// Step3: Perform the Matching and Process the Matching Result

		// All Matches
		String outputStrAll = matcher.replaceAll(replacementStr);
		System.out.println("Repalce All Matches Result: ");
		System.out.println(outputStrAll);

		// First Match Only
		String outputStr = matcher.replaceFirst(replacementStr);
		System.out.println("\nRepalce First Match Result: ");
		System.out.println(outputStr);
	}

}
