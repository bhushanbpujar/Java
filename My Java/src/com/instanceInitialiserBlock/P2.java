package com.instanceInitialiserBlock;

public class P2 
{
	int i;
	{
		System.out.println(i);
		i=20;
		System.out.println("FROM IIB");
	}
	P2()
	{
		System.out.println("From P2");
	}
	P2(int i)
	{
		System.out.println("From P2(int i)");
		System.out.println(this.i);
		this.i=i;
	}
	public static void main(String[] args) 
	{
		System.out.println("Start Main");
		P2 a=new P2();
		System.out.println(a.i);
		P2 b=new P2();
		System.out.println(b.i);
		P2 c=new P2(10);
		System.out.println(c.i);
		System.out.println("End Main");
		
	}
	
	}

