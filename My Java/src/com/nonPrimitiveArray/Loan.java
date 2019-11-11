package com.nonPrimitiveArray;

public class Loan {
	String name;
	double roi;
	Loan()
	{
		
	}
	Loan(String name,double roi)
	{
		this.name=name;
		this.roi=roi;
	}
	public static void main(String[] args)
	{
		Loan a=new Loan("vehicle loan",14);
		Loan b=new Loan("Personal loan",18);
		Loan c=new Loan("Educational loan",12);
		Loan loan [] = {a,b,c, new Loan("Home Loan", 10.5)};
	}

}
