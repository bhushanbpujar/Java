package com.staticMember;

public class Demo7 {
	static void m1()
	{
		System.out.println("From static ");
	}

	public static void main(String[] args)
	{
		m1();
		Demo7.m1(); // TODO Auto-generated method stub

	}

}
