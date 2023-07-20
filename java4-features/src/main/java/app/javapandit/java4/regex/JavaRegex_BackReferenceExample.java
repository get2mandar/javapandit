package app.javapandit.java4.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex_BackReferenceExample {

	public static void main(String[] args) {

		// Input String for Matching the RegEx Pattern
		String inputStr = "One:two:three:four";

		// RegEx Pattern to be Matched
		String regexStr = "(.+):(.+):(.+):(.+)";

		// Replacement Pattern with Back References when Pattern Matched
		String replacementStr = "$4-$3-$2-$1";

		// Step1: Allocate a Pattern Object to compile a RegEx
		Pattern pattern = Pattern.compile(regexStr);

		// Step2: Allocate a Matcher Object from the Pattern, and Provide the Input
		Matcher matcher = pattern.matcher(inputStr);

		// Step3: Perform the Matching and Process the Matching Result
		String outputStr = matcher.replaceFirst(replacementStr);
		System.out.println("Pattern With Back Reference Result: ");
		System.out.println(outputStr);
		// Output: four-three-two-One
	}

}
