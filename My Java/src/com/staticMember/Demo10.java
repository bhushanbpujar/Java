package com.staticMember;

public class Demo10 {
	static int i;
	public static void main(String[] args) {
		System.out.println("from main:");
		System.out.println(i);

	}
	static {
		System.out.println("from sib: ");
		i=10;
	}

}
