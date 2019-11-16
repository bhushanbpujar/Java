package com.objectClass;

public class Comp {
	public static void main(String[] args) 
	{
		Emp e= new Emp(1, "Bhushan");
		System.out.println(e);
		Emp a[]= {new Emp(2,"ABC"),e};
		System.out.println(a[0]);
		System.out.println(a[1]);
				
	}

}
