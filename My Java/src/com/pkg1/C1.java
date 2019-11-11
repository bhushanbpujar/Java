package com.pkg1;

public class C1 extends A1
{

	public static void main(String[] args)
	{
		//System.out.println(C1.i); CTE i is private hence not visible beyond same class
		A1 ob=new A1();
		//System.out.println(ob.j); CTE i is private hence not visible beyond same class
		
	}

}
