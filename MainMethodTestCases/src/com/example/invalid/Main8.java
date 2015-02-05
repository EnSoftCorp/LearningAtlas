package com.example.invalid;

public class Main8 {

	/**
	 * Invalid.
	 * 
	 * Although the syntax is strange, this compiles, but cannot be executed
	 * from the command line.
	 * 
	 * This is the most common form of the main method, but the square brackets
	 * for the args array are beside the type as well as beside the args
	 * variable. They should be beside one or the other, not both.
	 * 
	 * While it looks like this would not compile at all, it turns
	 * out that this is equivalent to main taking a two-dimensional array as a
	 * parameter. String[] args[] is the same as String[][] args or String
	 * args[][]. While it's certainly valid for a method to accept a
	 * two-dimensional array of Strings, this does not fit the required
	 * signature for a main method that is to be invoked from the command line.
	 * Attempting to execute this will result in the following error message:
	 * Exception in thread "main" java.lang.NoSuchMethodError: main
	 * 
	 * Source: https://rationalpi.wordpress.com/2007/01/29/main-methods-in-java/
	 */
	public static void main(String[] args[]) {
		System.out.println("Main8!");
	}

}
