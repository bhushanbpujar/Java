package com.exception;

public class E10 {
public static void main(String[] args) 
{
	int a[]= {0,1,2,3};
	System.out.println(a[0]);
	System.out.println(a[3]);
	try {
		System.out.println(a[9]);
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	System.out.println("End main");
}
}
