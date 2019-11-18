package com.hashCode;

public class Developer extends Employee
{
	String lang;
	Developer()
	{
		
	}
	Developer(int id,String name,double salary,String lang)
	{
		super(id,name,salary);
		this.lang=lang;
	}
	public String toString() {
		return super.toString() + " " + lang;
	}
	public boolean equals(Object ob)
	{
		Developer temp=(Developer) ob;
		return super.equals(temp)&& this.lang.equals(temp.lang);
	}
	public int hashCode() {
		return super.hashCode()+lang.hashCode();
}
}
