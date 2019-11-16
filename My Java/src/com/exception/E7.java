package com.exception;

public class E7 
{
	public static void main(String[] args) {
		System.out.println("Start main");
		E5 a=new E5();
		try {
			E6 b=(E6) a;
		}
		catch (ClassCastException e) 
		{
			System.out.println(e);
		}
		System.out.println("End main");
	}

}
