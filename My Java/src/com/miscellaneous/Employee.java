package com.miscellaneous;

public class Employee 
	{
	static int x=0;
	int id;
	String name;
	double salary;
	Employee()
	{
		++x;
		id=x;
	}
	Employee (String name,double salary)
	{
		this();
		this.name=name;
		this.salary=salary;
	}
	static Employee createObject(String name,double salary)
	{
		return new Employee(name,salary);
	}
	Employee display()
	{
		System.out.println("Employee details:" + " "+ id + " "+ name+ " "+ salary);
		return this;

		
	}
	Employee initialise(double salary)
	{
		this.salary=salary;
		return this;
	}

	public static void main(String[] args) 
	{
		Employee.createObject("Bhushan", 10000).initialise(20000).display(); //method Chain
		Employee.createObject("Adarsh", 10000).initialise(20000).display();  //method Chain
	}
	}


