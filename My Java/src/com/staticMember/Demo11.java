package com.staticMember;

public class Demo11 {  
	static int i;
static{
	System.out.println("from sib of demo11 ");
}
public static void main(String[] args) {
	
	System.out.println("from main of Demo11");
	System.out.println(Demo12.j);
}
}
