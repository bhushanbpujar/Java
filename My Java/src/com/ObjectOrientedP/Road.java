package com.ObjectOrientedP;

public class Road {

	public static void main(String[] args) 
	{
		Bike bike1=new Bike(45.0,"Red");
		System.out.println(bike1.color);
		System.out.println(bike1.mileage);
		System.out.println(bike1.e.cc);
		bike1.color="blue";
		bike1.mileage=35.6;
		bike1.e.cc=200;
		System.out.println(bike1.color);
		System.out.println(bike1.mileage);
		System.out.println(bike1.e.cc);
		

	}

}
