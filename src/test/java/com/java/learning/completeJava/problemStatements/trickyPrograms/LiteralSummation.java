package com.java.learning.completeJava.problemStatements.trickyPrograms;

public class LiteralSummation {
	
	/*
	 * Reason: “java” would be printed if String literals (in double quotes) are used, but in the question since character literals has been used, these won’t be concatenated. Therefore After execution of the program, an addition of each equivalent ASCII(Unicode) value of the character will be obtained.
		Hence the output is 106 + 97 + 118 + 97 = 418
	 */
	
	public static void main(String[] args) {
		System.out.println('j' + 'a' + 'v' + 'a');
	}
}