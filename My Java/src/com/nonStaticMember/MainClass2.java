package com.nonStaticMember;

public class MainClass2 {
	public static void main(String[] args) {
		A ob1=new A();
		A ob2=new A();
		System.out.println(ob1.d);
		System.out.println(ob2.d);
		ob1.d=20;
		System.out.println(ob1.d);
		System.out.println(ob2.d);
		ob1.d=100;
		ob2.d=200;
		System.out.println(ob1.d);
		System.out.println(ob2.d);
		
	}

}
