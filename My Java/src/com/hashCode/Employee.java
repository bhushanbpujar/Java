package com.hashCode;

public class Employee {
	int id;
	String name;
	double salary;
	Employee(){
		
	}

	public Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	public String toString() {
		return id+" "+name+" "+salary;
	}
	public boolean equals(Object ob)
	{
		Employee temp=(Employee) ob;
		return this.id==temp.id && this.salary==temp.salary && this.name==temp.name;
	}
	public int hashCode() {
		return id + name.hashCode()+(int)salary;
	}
}
