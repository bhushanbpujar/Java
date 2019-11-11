package com.primitiveTypecasting;
import java.util.Scanner;
public class swaparray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of array: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the Elements");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
        System.out.println("==============");
		int b[]=new int[n];
		for(int j=n-1,i=0;j>=0;j--,i++) {
			b[j]=a[i];
		}
		for(int i=0;i<n;i++) {
			System.out.println(b[i]);
		}
	}

}


























