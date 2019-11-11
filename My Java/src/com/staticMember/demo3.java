package com.staticMember;

public class demo3
{
	static int i=10;
	public static void main(String[] args)
	{
		System.out.println(demo3.i);
		demo3.i=30;
		System.out.println(demo3.i);

	}

}
