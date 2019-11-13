package com.ATM;
class ATMI implements ATM
{
	long balance;
	ATMI(){
		
	}
	ATMI(long balance){
		this.balance=balance;
	}
	public void deposit(long dAmt)
	{
		if(dAmt>0) {
			balance=balance+dAmt;
			checkBal();
		}
		else 
		{
			System.out.println("Enter Valid Amount");
		}
		
	}
	public long checkBal() {
		System.out.println(balance);
		return balance;
	}
	@Override
	public void withdrawal (long wAmt) 
	{
		if(wAmt<balance)
		{
			balance=balance-wAmt;
			checkBal();
			
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
}
