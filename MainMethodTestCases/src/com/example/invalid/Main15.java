package com.example.invalid;

public class Main15 {

	/**
	 * Invalid.
	 * 
	 * Compiles, but cannot be run from the command line. The main() method must
	 * accept an array of Strings, not ints, as a parameter.
	 * 
	 * Since the signature doesn't match it's a completely different method that
	 * just happens to be called main.
	 * 
	 * Source: https://rationalpi.wordpress.com/2007/01/29/main-methods-in-java/
	 */
	public static void main(int[] args) {
		System.out.println("Main15!");
	}

}
