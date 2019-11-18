package com.hashCode;

public class MainClass {
	public static void main(String[] args) {
		Developer a[]= { new Developer(1, "A", 10,"Java"), new Developer(2, "B", 20,"Python"), new Developer(2, "B", 20,"Python"),};
		TestEngineer b[]= {new TestEngineer(3, "X", 10, "Selenium"),new TestEngineer(4, "Y", 12, "Opium"),new TestEngineer(3, "X", 10, "Selenium")};
		System.out.println(a[0].equals(a[1]));
		System.out.println(a[1].equals(a[2]));
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[1].hashCode());
		System.out.println(a[2].hashCode());
		System.out.println(b[0].equals(b[1]));
		System.out.println(b[1].equals(b[2]));
		System.out.println(b[1]);
		System.out.println(a[2]);
		System.out.println(b[1].hashCode());
		System.out.println(b[2].hashCode());
		
		
	}

}
