package com.exception;
//Exception Overflow
public class E12 {
static void m3() {
	System.out.println("from m3");
	try {
	int c=10/0;
	}
	catch (ArithmeticException e) {
		System.out.println(e);
	}
}
	static void m2() {
		System.out.println("from m2");
	try {
		m3();
	}
	catch (RuntimeException e) {
		System.out.println(e);
	}
	System.out.println("end m2");
	}
	static void m1() {
		System.out.println("from m1");
		m2();
		System.out.println("end m1");
		
	}
	public static void main(String[] args) {
		System.out.println("from main");
		m1();
		System.out.println("end main");
	}
}

