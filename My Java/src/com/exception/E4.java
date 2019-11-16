package com.exception;

public class E4 {

	public static void main(String[] args)
	{
		System.out.println("main start");
		int a=10;
		System.out.println(1);
		int b=0;
		System.out.println(2);
		int c;
		System.out.println(3);
		try {
		c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println(4);
	}

}
