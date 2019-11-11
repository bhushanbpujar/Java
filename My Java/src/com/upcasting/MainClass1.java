package com.upcasting;

public class MainClass1 {

	public static void main(String[] args) 
	{
		A ob1=new B(); //UPCASTING
		System.out.println(ob1.i);
		//System.out.println(ob1.j); //Using parent type reference to access child class member.
		B ob2=new B();
		System.out.println(ob2.i);
		System.out.println(ob2.j);
		A ob3=ob2;                     // UPCASTING
		System.out.println(ob3.i); 
		//System.out.println(ob3.j); //Using parent type reference to access child class member.
	}

}
