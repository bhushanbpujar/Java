package com.exception;

public class E9
{
	int i;
	public static void main(String[] args) {
		System.out.println("Start Main");
		E9 a=new E9();
		a=null;
		try {
			System.out.println(a.i);
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("End Main");
	}

}
