package com.constructor;

public class P2 {
	int i=10;
	double j=2.5;
	P2()
	{
		System.out.println("From P2");
		System.out.println(i);
		System.out.println(j);
		System.out.println(this.i);
		System.out.println(this.j);
	}

	public static void main(String[] args)
	{
		System.out.println("START MAIN");
		P2 a=new P2();
		System.out.println(a);
		System.out.println(a.i);
		System.out.println(a.j);
		System.out.println("END MAIN");
	}

}
