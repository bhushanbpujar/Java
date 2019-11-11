package com.constructor;

public class Employee {
	String name;
	double salary;
	int id;
	Employee(String name,double salary, int id)
	{
		this.name=name;
		this.salary=salary;
		this.id=id;
		System.out.println("Name: "+ name+ " Salary " + salary + " id " + id);
	}

	public static void main(String[] args) {
		Employee a=new Employee("Suresh",20019,44);
		Employee b=new Employee("Mahesh",20018,48);
		Employee c=new Employee("Ramesh",20010,47);

	}

}
