package com.staticMember;

public class demo6 {
	static int i=20;
	public static void main(String[] args) {
		int i=10;
		System.out.println(i); //10
		System.out.println(A.i);//2
		System.out.println(demo6.i);//20
		m1();						//20
		System.out.println(i);//10
		System.out.println(A.i);//40
		System.out.println(demo6.i);//30
		
	}
	public static void m1() {
		System.out.println(i);
		i=30;
		A.i=40;

}
}
