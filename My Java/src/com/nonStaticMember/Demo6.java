package com.nonStaticMember;

public class Demo6 {
		void m1() {
			System.out.println("From M1");
		}
	public static void main(String[] args) {
		System.out.println("From main");
		Demo6 a=new Demo6();
		System.out.println(a);
		a.m1();
		
	}

}
