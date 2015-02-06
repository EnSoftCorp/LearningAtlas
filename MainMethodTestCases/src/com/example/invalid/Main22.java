package com.example.invalid;

public class Main22 {

	/**
	 * Invalid.
	 * 
	 * This method compiles but does not return void. It looks similar to a
	 * C style program that returns an exit code. However this is done using
	 * System.exit(int status) not the return type of main.
	 */
	public static int main(String[] args) {
		return 0;
	}

}
