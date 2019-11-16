package com.objectClass;

public class Emp {
	int id;
	String name;
	Emp(){
		
	}
	Emp(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	public String toString() {
		return id+" "+name;
	}

}
