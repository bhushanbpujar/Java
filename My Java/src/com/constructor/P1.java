package com.constructor;

public class P1 {
	P1()
	{
		System.out.println("from constructor P1 ");
	}

	public static void main(String[] args) {
		P1 a=new P1();
		System.out.println(a);
		P1 b=new P1();
		System.out.println(b);

	}

}
