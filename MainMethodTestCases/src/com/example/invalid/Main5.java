package com.example.invalid;

public class Main5 {

	/**
	 * Invalid.
	 * 
	 * Compiles, but cannot be executed from the command line.  Method must be public.
	 * 
	 * Since the signature doesn't match it's a completely different method that
	 * just happens to be called main.
	 * 
	 * Source: https://rationalpi.wordpress.com/2007/01/29/main-methods-in-java/
	 */
	static void main(String[] args) {
		System.out.println("Main5!");
	}

}
