package com.instanceInitialiserBlock;

public class Demo {
	Demo()
	{
		System.out.println("demo()");
	}
	Demo(int i)
	{
		this();
		System.out.println("demo(int i)");
	}
	Demo(int i,int j)
	{
		this();
		System.out.println("hello");
	}
	{
		System.out.println("IIB");
	}
	
	public static void main(String[] args)
	{
		Demo a=new Demo();
		System.out.println("**************");
		Demo b=new Demo(1);
		System.out.println("**************");
		Demo c=new Demo(1,2);
	}

}
