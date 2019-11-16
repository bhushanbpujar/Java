package com.exception;

import java.util.Scanner;

public class E11 {
	static Scanner z=new Scanner(System.in);
	public static void main(String[] args) {
		int a=10;
		System.out.println("Enter the Value you want to divide 10 by: ");
		int b= z.nextInt();
		int x[]={1,2,3,4};
		System.out.println("Enter index between 0 to 3");
		int c=z.nextInt();
		try
		{
			int d=a/b;
			System.out.println(d);
			System.out.println(x[c]);
		} 
		catch (ArithmeticException e) {
			System.out.println(e);
			
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("end main");
	}

}
