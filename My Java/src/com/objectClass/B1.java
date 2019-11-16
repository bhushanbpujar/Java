package com.objectClass;

public class B1 extends A1{
	char c;
	String s;
	B1(){
		
	}
	public B1(int i,double j,char c, String s) 
	{
		super(i,j);
		this.c = c;
		this.s = s;
	}
	public String toString() {
		return super.toString() + " "+ c + " "+ s;
	}
}
