package com.pkg1;

public class B1 {

	public static void main(String[] args) 
	{
		//System.out.println(A1.i); CTE i is private hence not visible beyond same class.
		A1 b=new A1();
		//System.out.println(b.j); // CTE i is private hence not visible beyond same class.

	}

}
