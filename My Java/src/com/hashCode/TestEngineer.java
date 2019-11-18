package com.hashCode;

public class TestEngineer extends Employee
{
	String tool;
	TestEngineer()
	{
		
	}
	TestEngineer(int id,String name,double salary,String tool)
	{
		super(id,name,salary);
		this.tool=tool;
	}
	public String toString() {
		return super.toString() + " " + tool;
	}
	public boolean equals(Object ob)
	{
		TestEngineer temp=(TestEngineer) ob;
		return super.equals(temp)&& this.tool==temp.tool;
	}
	public int hashCode() {
		return super.hashCode()+tool.hashCode();
}
}
