package com.pkg2;
import com.pkg1.A2;

public class Y2 extends A2
{

	public static void main(String[] args) {
		//System.out.println(A2.i); //CTE i is default hence not visible beyond same package.
		Y2 z=new Y2();
		//System.out.println(z.j); //CTE i is default hence not visible beyond same package.
		

	}

}
