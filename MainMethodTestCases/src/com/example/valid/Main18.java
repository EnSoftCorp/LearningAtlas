package com.example.valid;

public class Main18 {

	/**
	 * Static Inner Class
	 */
	static public class A {

		/**
		 * Valid.
		 * 
		 * Main Methods can be nested, but its non standard. Any class that can
		 * have a static method can have a public static void main(String[] args). 
		 * This includes top-level classes (whether public or not). 
		 * You would have to launched with something like "java Main18$A"
		 * 
		 * Source: http://stackoverflow.com/a/9126159/475329
		 */
		public static void main(String[] args) {
			System.err.println("Main18!");
		}
	}

}
