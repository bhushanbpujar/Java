package com.miscellaneous;

public class DisplayArray 
	{
		static void dislayArray(int[] a)
		{
			for(int z: a)
			{
				System.out.println(z+" ");
			}
		}
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5};
		dislayArray(a);
		for(int i=0;i<5;i++)
		{
			a[i]=a[i]+1;
		}
		dislayArray(a);
	}
		


}
