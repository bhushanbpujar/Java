package com.pkg2;
import com.pkg1.A2;

public class Z2 {

	public static void main(String[] args) {
		// System.out.println(A2.i); // CTE i is default hence not visible beyond same package.
		Z2 z=new Z2();
		//System.out.println(z.j);  // CTE i is default hence not visible beyond same package.

	}

}
