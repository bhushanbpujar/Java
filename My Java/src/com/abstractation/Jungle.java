package com.abstractation;

public class Jungle {

	public static void main(String[] args) 
	{
		Lion l=new Lion(132.5,55);
		l.talk();
		Cat c=new Cat(60.5,15);
		c.talk();
		Dog d=new Dog(90.8,23);
		d.talk();
		Animal a=new Cat(30.6,13);
		a.talk();
	}

}
