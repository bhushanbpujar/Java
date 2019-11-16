package com.objectClass;

public class TestEngineer extends Employee {
	String tool;
	TestEngineer()
	{
		
	}
	public TestEngineer(int id, String name, double salary, String tool) 
	{
		super(id,name,salary);
		this.tool = tool;
	}
	public String toString() {
		return super.toString()+ " "+tool;
	}
	
	

}
