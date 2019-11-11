package com.instanceInitialiserBlock;

public class P4 {
	P4()
	{
		System.out.println("demo()");
	}
	P4(int i)
	{
		this();
		System.out.println("demo(int i)");
	}
	P4(int i,int j)
	{
		this();
		System.out.println("hello");
	}
	P4(double i)
	{
		this(10);
		System.out.println("demo(double i)");
	}
	{
		System.out.println("IIB");
	}
	
	public static void main(String[] args)
	{
		P4 a=new P4();
		System.out.println("**************");
		P4 b=new P4(1);
		System.out.println("**************");
		P4 c=new P4(1,2);
		System.out.println("**************");
		P4 d=new P4(1.2);
	}

}
