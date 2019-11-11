package com.nonStaticMember;

public class Demo5 {
	void m1()
	{
		System.out.println("from m1");
		System.out.println(this);
	}
	void m2()
	{
		System.out.println("from m1");
		System.out.println(this);
	}
	public static void main(String[] args)
	{
		System.out.println("From main");
		Demo5 a=new Demo5();
		Demo5 b=new Demo5();
		System.out.println(a);
		System.out.println(b);
		a.m1();
		a.m2();
		b.m1();
		b.m2();

	}

}
