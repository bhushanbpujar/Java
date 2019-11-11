package com.primitiveTypecasting;

public class Demo5 {

	public static void main(String[] args) {
		int a[]= {10,2,3,10};
		int i= a.length;
		int n;
		for(n=0;n<i;n++)
		{
			System.out.println(a[n]);
		}
		System.out.println("--------------");
		for(n=0;n<i;n++)
		{
			a[n]+=10;
			System.out.println(a[n]);
		}
		

	}

}
