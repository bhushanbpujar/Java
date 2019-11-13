package com.encpasulation;

public class Employee {
	private int id;
	private String name;
	private double salary;
	Employee(){
		
	}
	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public void setSalary(double salary)
	{
		if(salary>(this.salary))
		{
			this.salary=salary;
		}
		else
		{
			System.out.println("Thank you,Next");
		}
	}
	public double getSalary()
	{
		return salary;
	}

}
