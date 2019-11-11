package com.instanceInitialiserBlock;

public class IciciBank {

	public static void main(String[] args)
	{
		Loan loan1=new Loan();
		loan1.name="Vehicle Loan";
		loan1.rateOfInterest=12;
		System.out.println(loan1.loanId);
		System.out.println(loan1.name);
		System.out.println(loan1.rateOfInterest);
		System.out.println("***************************");
		Loan loan2=new Loan("Personal",16.0);
		System.out.println(loan2.loanId);
		System.out.println(loan2.name);
		System.out.println(loan2.rateOfInterest);
		System.out.println("***************************");
		Loan loan3=new Loan("Home",10.5);
		System.out.println(loan3.loanId);
		System.out.println(loan3.name);
		System.out.println(loan3.rateOfInterest);
		System.out.println("***************************");

	}

}
