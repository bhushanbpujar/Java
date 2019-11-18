package com.instanceOf;

public class MainClass 
	{
	public static void main(String[] args)
	{
		A ob1=new B(10,20);
		System.out.println(ob1 instanceof A);
		System.out.println(ob1 instanceof B);
		// System.out.println(ob1 instanceof D); ob1 has no is-a reltnship with D
		B ob2=new B(10,20);
		System.out.println(ob2 instanceof A);
		System.out.println(ob2 instanceof B);
		// System.out.println(ob2 instanceof D); ob2 has no is-a reltnship with D
		A ob3=new A(10);
		System.out.println(ob3 instanceof A);
		System.out.println(ob3 instanceof B);
		// System.out.println(ob3 instanceof D); ob3 has no is-a reltnship with D
		
	}

	}
