package com.objectClass;

public class MainClass2 {
	public static void main(String[] args) {
		Employee e[]= {new Developer(1, "ABC", 10, "Java"),new TestEngineer(2, "BCD", 12, "Selenium"),new Developer(3, "CDE", 15, "Python"),new TestEngineer(4, "DEF", 20, "Opium")};
		for(Employee z:e)
		{
			System.out.println(z);
		}
		
	}
	
}
