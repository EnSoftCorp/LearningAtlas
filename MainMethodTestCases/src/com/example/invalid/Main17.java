package com.example.invalid;

public class Main17 {

	/**
	 * Compiles, but cannot be run from the command line.
	 * 
	 * The main() method must be all lower case.
	 * 
	 * Since the signature doesn't match it's a completely different method that
	 * just happens to be called main.
	 * 
	 * Source: https://rationalpi.wordpress.com/2007/01/29/main-methods-in-java/
	 */
	public static void Main(String[] args) {
		System.out.println("Main17!");
	}

}
