package com.inheritance;

public class Dog extends Animal {
	String color;
	Dog(int height, int weight,String color)
	{
		super(height,weight);
		this.color=color;
		
	}

	public static void main(String[] args) {
	Dog d1=new Dog(22,23,"White");
	System.out.println(d1.height);
	System.out.println(d1.weight);
	System.out.println(d1.color); 

	}

}
