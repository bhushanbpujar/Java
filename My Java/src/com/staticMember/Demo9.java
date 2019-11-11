package com.staticMember;
//static blocks get executed first during class loading process.
public class Demo9 {
	static {
		System.out.println("1");
	}

	public static void main(String[] args) {
		System.out.println("2");

	}
	static {
		System.out.println("3");
	}

}
