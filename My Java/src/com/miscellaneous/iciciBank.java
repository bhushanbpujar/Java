package com.miscellaneous;

class iciciBank 
{
	static void m1(Loan z)
	{
		System.out.println();
	}

	public static void main(String[] args)
	{
		Loan loan1=new Loan("Education loan",12);
		Loan loan2=new Loan("Personal loan",16.0);
		Loan loan3=new Loan("Home loan",10.5);
		m1(loan1);
		m1(loan2);
		m1(loan3);
	}
}
