package com.nonStaticMember;

public class Demo4 {
	int i=10;

	public static void main(String[] args) {
		int i=20;
		Demo4 a=new Demo4();
		System.out.println(i);
		System.out.println(a.i);
	}

}
