package com.miscellaneous;

public class swapArray 
	{
		static void swap(int a[])
		{
			int temp=a[0];
			a[0]=a[a.length-1];
			a[a.length-1]=temp;
		}
		static void swap(int a[], int b,int c)
		{
			int temp=a[b];
			a[b]=a[c];
			a[c]=temp;
		}

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		DisplayArray.dislayArray(a);
		swap(a);
		DisplayArray.dislayArray(a);
		System.out.println("***********************************");
		DisplayArray.dislayArray(a);
		swap(a,2,4);
		DisplayArray.dislayArray(a);
		
	}

}
