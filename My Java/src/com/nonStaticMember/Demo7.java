package com.nonStaticMember;
//calling non static variable from non static method
public class Demo7 {
	int a=10;
	void m1()
	{
		System.out.println(a);
		a=20;
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		System.out.println("main start");
		Demo7 z=new Demo7();
		z.m1();
		System.out.println("main end");
	}

}
