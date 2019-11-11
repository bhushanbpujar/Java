package com.nonStaticMember;

public class Demo2 {
	int i;
	boolean j;
	public static void main(String[] args) {
		System.out.println(new Demo2());
		new Demo2();
		Demo2 a=new Demo2();
		System.out.println(a);
		a.i=1;
		a.j=2>1;
		System.out.println(a.i);
		System.out.println(a.j);
	}

}
