package com.exception;

public class E8 {
	static void m3() {
		System.out.println("from M3");
		int a[]= {1,2,3};
		System.out.println(a[4]);
		System.out.println("M3 ends");
	}
	static void m2()
	{
		System.out.println("from m2");
		m3();
		System.out.println("m2 ends");
		
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
