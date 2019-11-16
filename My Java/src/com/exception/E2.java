package com.exception;

public class E2 
{
	int i;
	public static void main(String[] args) 
	{
		System.out.println(1);
		E2 ob=new E2();
		System.out.println(2);
		ob=null;
		System.out.println(ob.i); //NullPointerException
		System.out.println(3);
	}

}
