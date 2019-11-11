package com.upcasting;

public class MainClass2 {

	public static void main(String[] args) 
	{
		B a=new C();                   // UPCASTING
		System.out.println(a.i);
		System.out.println(a.j);
		//System.out.println(a.k);    //Using parent type reference to access child class member.
		A b=new C();
		System.out.println(b.i);
	//	System.out.println(b.j);     // Using parent type reference to access child class member.
	//	System.out.println(b.k);     //Using parent type reference to access child class member.
		A c=a;
		System.out.println(c.i); 
	//	System.out.println(c.j);   //Using parent type reference to access child class member.
	//	System.out.println(c.k);   // Using parent type reference to access child class member.
	}
}
