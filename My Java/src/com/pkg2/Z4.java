package com.pkg2;
import com.pkg1.A4;

public class Z4 {

	public static void main(String[] args) {
		// System.out.println(A4.); //CTE i is protected hence not visible in other class from other package.
		A4 a=new A4();
		//System.out.println(a.j); //CTE i is protected hence not visible in other class from other package.

	}

}
