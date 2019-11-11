package com.constructor;

public class MainClass {

	public static void main(String[] args) 
	{
		System.out.println("Start main");
		Demo1 a=new Demo1();
		System.out.println("********************");
		Demo1 b=new Demo1();
		System.out.println("********************");
		Demo2 c=new Demo2(10<20 );
		System.out.println("********************");
		Demo3 d=new Demo3(10);
		System.out.println("********************");
		P4 z=new P4(10,10==10);
		System.out.println(z.i);
		System.out.println(z.b);
		System.out.println("End main");

	}

}
