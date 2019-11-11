package com.staticMember;

public class demo5 {
	static int i;

	public static void main(String[] args) {
		int i=20;
		System.out.println(i);
		System.out.println(demo5.i);
		m1();
		System.out.println(demo5.i);

	}
	public static void m1() {
		System.out.println(i);
		i=20;

}
}