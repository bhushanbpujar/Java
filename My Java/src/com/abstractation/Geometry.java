package com.abstractation;

public class Geometry {

	public static void main(String[] args) 
	{
		Shape s;
		s=new Circle(10);
		System.out.println(s.area());
		System.out.println(((Circle)s).radius);
		s=new Rectangle(10,20);
		System.out.println(s.area());
		System.out.println(((Rectangle)s).length);
		System.out.println(((Rectangle)s).breadth);
		s=new RightAT(10,30);
		System.out.println(s.area());
		System.out.println(((RightAT)s).base);
		System.out.println(((RightAT)s).height);

	}

}
