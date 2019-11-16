package com.objectClass;

public class Developer extends Employee {
	String lang;
	Developer()
	{
		
	}
	public Developer(int id, String name, double salary, String lang) 
	{
		super(id,name,salary);
		this.lang = lang;
	}
	public String toString() {
		return super.toString()+ " "+lang;
	}
	
	

}
