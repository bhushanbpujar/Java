package com.constructor;

class P3 {
	int i;
	P3()
	{
		i=10;
	}
	P3(int a )
	{
		i=a;
	}
	public static void main(String[] args) 
	{
		P3 a=new P3();
		System.out.println(a.i);
		P3 b=new P3();
		System.out.println(b.i);
		P3 c=new P3();
		System.out.println(c.i);
		P3 d=new P3(100);
		System.out.println(d.i);
		P3 e=new P3(200);
		System.out.println(e.i);
		P3 f=new P3(300);
		System.out.println(f.i);
	}

}
