package com.polymorphism;

public class MainClass {
	static void display(Bank bank)
	{
		System.out.println(bank.roi());
	}

	public static void main(String[] args) 
	{
		Bank b;
		b=new SBI();
		display(b);
		b=new SBIinTouch();
		display(b);
		b=new ICICI();
		display(b);
		b=new Axis();
		display(b);
		b=new Bank();
		display(b);
		
		

	}

}
