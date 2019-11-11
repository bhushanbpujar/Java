package com.instanceOf;

public class MainClass2 {
	public static void display(A a)
	{
		System.out.println(a.i);
		if(a instanceof B)
		{
			B b=(B) a;
			System.out.println(b.j);
		}
		if(a instanceof C)
		{
			C c=(C) a;
			System.out.println(c.k);
		}
	}

	public static void main(String[] args) 
	{
		A a=new A(10);
		display(a);
		B b=new B(10,20);
		display(b);
		C c=new C(10,20,30);
		display(c);
		A a1=new C(100,200,300);
		display(a1);
		B b1=new B(10,20);
		display(b1);
		A a2=new B(100,200);
		display(a2);
		

	}

}
