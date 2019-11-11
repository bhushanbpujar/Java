package com.miscellaneous;

public class mainClass {
	static void test(A ob)
	{
		System.out.println(ob.i+" "+ob.j);
	}


	public static void main(String[] args) 
	{
		A a=new A(13,20);
		A b=new A(12,21);
		A c=new A(11,23);                                                                                     
		A d=new A(15,24);
		test(a);
		test(b);
		test(c);
		test(d);
	}
}
