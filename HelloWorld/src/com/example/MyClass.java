package com.example;

public class MyClass {

	public static void A() {
		B();
	}

	public static void B() {
		C();
	}

	public static void C() {
		B();
		D();
	}

	public static void D() {
		G();
		E();
	}

	public static void E() {

	}

	public static void F() {

	}
	
	public static void G() {

	}

}
