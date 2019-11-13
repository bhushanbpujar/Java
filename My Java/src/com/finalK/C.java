package com.finalK;

public class C {
	final static int i=100; 
	final static void test()
	{
		System.out.println("from C");
	}

	public static void main(String[] args) {
		System.out.println(i);
		//i=i++;
		System.out.println(i+10);

	}

}
