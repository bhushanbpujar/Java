package com.encpasulation;

public class EmployeePortal {

	public static void main(String[] args) {
		Employee e=new Employee(1,"Bhushan",1000);
		System.out.println("Employee id is "+ e.getId());
		System.out.println("Employee name is "+e.getName());
		System.out.println("Employee salary is "+e.getSalary());
		e.setSalary(901);
		System.out.println("New Employee salary is "+e.getSalary());
	}

}
