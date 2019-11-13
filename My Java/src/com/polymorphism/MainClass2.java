package com.polymorphism;

public class MainClass2 {

	public static void main(String[] args) {
		Bank b[]= new Bank[5];
		b[0]=new SBI();
		b[1]=new SBIinTouch();
		b[2]=new ICICI();
		b[3]=new Axis();
		b[4]=new Bank();
		for(int i=0;i<5;i++)
		{
			System.out.println(b[i].roi());
		}

	}

}
