package com.instanceInitialiserBlock;
class Loan
{
	String name;
	double rateOfInterest;
	String loanId;
	static int i;
	Loan()
	{
		
	}
	{
		++i;
		this.loanId="ICICIL" + i;
	}
	
	Loan(String name,double rateOfInterest)
	{
		this.name=name;
		this.rateOfInterest=rateOfInterest;
	}

}
