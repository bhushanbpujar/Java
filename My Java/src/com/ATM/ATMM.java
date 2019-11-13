package com.ATM;

public class ATMM {

	public static void main(String[] args) {
		ATM atm=new ATMI(0);
		atm.checkBal();
		atm.deposit(1000);
		atm.checkBal();
		atm.withdrawal(500);
		
	}
}
