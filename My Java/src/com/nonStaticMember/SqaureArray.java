package com.nonStaticMember;
//import java.util.Scanner;
public class SqaureArray {
	int sqaure(int w)
	{
		return w*w;
	}
	public static void main(String[] args) { 
		SqaureArray s1=new SqaureArray();
		int size=10;
		int a[]=new int[size];
		for(int i=0,n=1;i<a.length;i++,n++)
		{
			a[i]=s1.sqaure(n);
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}

}
