package com.instanceInitialiserBlock;

public class P1 {
	{
		System.out.println("FROM IIB 1");
	}
	public static void main(String[] args) 
	{
		P1 a=new P1();
		System.out.println("******************");
		P1 b=new P1();
	}
	{
		System.out.println("FROM IIB 2");
	}

}
