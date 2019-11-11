package com.constructor;

public class Loan {
	String name;
	double roi;
	Loan(String name, double roi)
	{
		this.name=name;
		this.roi=roi;
		System.out.println("Name: "+ name);
		System.out.println(" Rate of Interest " + roi);
	}

	public static void main(String[] args) {
		Loan a=new Loan("Aman",10.5);
		Loan b=new Loan("Naman",12.5);

	}

}
