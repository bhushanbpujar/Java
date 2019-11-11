package com.constructor;

public class Demo5 {
	Demo5()
	{
			System.out.println("from demo5 " );
	
	}
	Demo5(int a)
	{
			System.out.println("from demo5(int a)");
	
	}
	Demo5(int a,int b)
	{
			System.out.println("from demo5(int a,int b)");
	
	}
	public static void main(String[] args) {
		Demo5 a=new Demo5(10);
		Demo5 b=new Demo5();
		Demo5 c=new Demo5(10,20);
	}
}
