package com.polymorphism;

public class B extends A {
	void test()
	{
		System.out.println("From B");
	}

	public static void main(String[] args) {
		A ob;
		ob = new A();
		ob.test();
		ob=new B();
		ob.test();
		

	}

}
