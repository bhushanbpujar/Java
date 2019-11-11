package com.primitiveTypecasting;

public class Prime {
	public static boolean isprime (int a) 
	{
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
				return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		int a[]=new int[20];
		int n=10;
		for(int i=0;i<20;n++)
		{
			boolean z= isprime(n);
			if(z==true) {
				a[i++]=n;
			}
				
		}
		for(int z:a) {
			System.out.println(z);
		}
	}
}
