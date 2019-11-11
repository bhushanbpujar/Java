package com.nonStaticMember;

class Stationary{
	public static void main(String[] args) {
		Marker m1=new Marker();
		Marker m2=new Marker();
		m1.price=10;
		m2.price=20;
		m1.color="black";
		m2.color="blue";
		System.out.println(m1.price);
		System.out.println(m1.color);
		System.out.println(m2.price);
		System.out.println(m2.color);
		m1.writing();
		m2.writing();
	}

}
