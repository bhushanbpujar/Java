package com.isA;

public class P2 extends P1
	{
		int j;
		public static void main(String[] args) {
			P2 ob1=new P2();
			System.out.println(ob1.a);
			System.out.println(ob1.j);
			P1 ob2=new P1();
			ob1.a=30;
			ob2.a=50;
			System.out.println(ob2.a);
			
			
		}
	}
