package com.ObjectOrientedP;

public class Bike {
	Engine e=new Engine(150);
	double mileage;
	String color;
	Bike()
	{
		
	}
	Bike(double mileage,String color)
	{
		this.color=color;
		this.mileage=mileage;
	}
	

}
