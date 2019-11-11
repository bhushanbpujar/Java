package com.instanceOf;

public class MainClass3 
{
	public static void display(A ob)
	{
		System.out.println(ob.i);
		if(ob instanceof D)
		{
			D d=(D) ob;
			System.out.println(d.k);
		}
	}
	public static void main(String[] args) 
	{
		A a=new A(10);
		display(a);
		A a1=new D(100,200);
		display(a1);
		D d=new D(1000,2000);
		display(d);
		
	}

}
