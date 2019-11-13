package com.finalK;

public class D {
	final int i=10;
	final void test() {
		System.out.println("from D");
	}
	public static void main(String[] args) {
		D d=new D();
	System.out.println(d.i);
	//d.i=d.i++;
	System.out.println(d.i+10);
	
	

	}

}
