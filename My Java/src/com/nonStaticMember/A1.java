package com.nonStaticMember;

public class A1 {
	int i;
	void initialising(int i)
	{
		this.i=i;
	}

	public static void main(String[] args)
	{
		A1 a= new A1();
		a.initialising(10);

	}
}
