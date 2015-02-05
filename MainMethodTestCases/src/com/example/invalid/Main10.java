package com.example.invalid;

public class Main10 {

	/**
	 * Invalid.
	 * 
	 * Compiles, but cannot be executed from the command line. The main() method
	 * needs to accept an array of Strings as a parameter. The method below
	 * accepts a single String called args.
	 * 
	 * Since the signature doesn't match it's a completely different method that
	 * just happens to be called main.
	 * 
	 * Source: https://rationalpi.wordpress.com/2007/01/29/main-methods-in-java/
	 */
	public static void main(String args) {
		System.out.println("Main10!");
	}

}
