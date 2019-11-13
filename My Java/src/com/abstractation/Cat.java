package com.abstractation;

public class Cat extends Animal
{
	Cat(){
		
	}
	Cat(double height,double weight)
	{
		super(height,weight);
		
	}
	void talk() {
		System.out.println("Cat meows");
	}
	
}
