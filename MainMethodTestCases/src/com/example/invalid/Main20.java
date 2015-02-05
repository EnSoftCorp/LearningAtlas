package com.example.invalid;

public class Main20 {

	/**
	 * Inner Non-Static Class
	 */
	@SuppressWarnings("unused")
	private class Bar {
		/**
		 * Invalid.
		 * 
		 * Compile error. The method main cannot be declared static; static
		 * methods can only be declared in a static or top level type.
		 * 
		 * Source: http://stackoverflow.com/a/9126159/475329
		 */
//        public static void main(String[] args) {
//            System.out.println("Main20!");
//        }
    };
	
}
