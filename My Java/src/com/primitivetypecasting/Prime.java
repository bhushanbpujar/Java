package com.primitivetypecasting;

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
		int a[]=new int[7];
		int n=333;
		for(int i=0;i<7;n++)
		{
			boolean z= isprime(n);
			if(z==true) {
				a[i++]=n;
			}
				
		}
		for(int i=0;i<7;i++) {
			System.out.println(a[i]);
		}
	}
}
